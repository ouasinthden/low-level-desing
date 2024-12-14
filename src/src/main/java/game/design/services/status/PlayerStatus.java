package game.design.services.status;

import game.design.models.EntityStatus;
import game.design.models.Player;

public class PlayerStatus {
    public EntityStatus getPlayerStatus(Player player){
        return EntityStatus.IDLE;
    }
}
