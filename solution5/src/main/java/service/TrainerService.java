package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.springassignment.solution5.*;

public class TrainerService {
	
	private final String url="jdbc:mysql://localhost:3306/demoDB";
	private final String username="root";
	private final String password="root@123";
	
	public List<Trainer> getAllTrainersWithSessions(){
		String  sql="SELECT t.id AS trainer_id, t.name AS trainer_name, s.id AS session_id, s.name AS session_name "+
					"FROM trainer t "+
					"LEFT JOIN session s ON t.id = s.trainer_id";
		
		List<Trainer> trainers=new ArrayList<>();
		try (Connection con= DriverManager.getConnection(url, username, password);
				PreparedStatement st= con.prepareStatement(sql);
				ResultSet rs=st.executeQuery()){
			Map<Integer, Trainer> trainerMap = new HashMap<>();
			while(rs.next()) {
				int trainerID= rs.getInt("trainer_id");
				String trainerName = rs.getString("trainer_name");
                int sessionId = rs.getInt("session_id");
                String sessionName = rs.getString("session_name");

                Trainer trainer = trainerMap.computeIfAbsent(trainerID, k -> {
                    Trainer newTrainer = new Trainer();
                    newTrainer.setId(trainerID);
                    newTrainer.setName(trainerName);
                    newTrainer.setSessions(new ArrayList<>());
                    return newTrainer;
                });

                if (sessionId > 0) {
                    Session session = new Session();
                    session.setId(sessionId);
                    session.setName(sessionName);
                    trainer.getSessions().add(session);
                }
            }

            trainers.addAll(trainerMap.values());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return trainers;
    }

}
