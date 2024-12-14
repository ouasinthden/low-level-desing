package game.design.Dao;


import game.design.models.EntityStatus;
import game.design.models.Player;
import game.design.services.status.PlayerStatus;

import static game.design.models.EntityStatus.PLAYING;

public class PlayerStatusDao {

    public void setIdleStatus(Player player, EntityStatus playerStatus){

    }
    public void setStatus(Player player, EntityStatus PLAYING){
        String sql = "UPDATE PLAYER_STATUS SET STATUS = 'PLAYING' where PLAYER_ID = :PLAYER_ID;";
        //update

    }
}
