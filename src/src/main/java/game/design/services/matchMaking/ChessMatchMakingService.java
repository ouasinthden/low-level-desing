package game.design.services.matchMaking;

import game.design.models.MatchDO;

import java.util.ArrayList;
import java.util.List;

public class ChessMatchMakingService implements MatchMakingInterface {

    @Override
    public List<MatchDO> findMatch() {
        /*
        * We have to call Redis or any other database to get List of idle players
        * Storage should look like this ->
        *
        * Key, Value pair
         CREATE TABLE players_status_info (
                player_id INT PRIMARY KEY,
                rating INT,
                is_idle BOOLEAN,
                last_idle_time TIMESTAMP,
                player_name VARCHAR(255),
                total_games INT,
        );
        *
        * */

        //SQL will be the best choice here.

        /*Step 1
        * Get all the player status whose STATUS is IDLE ;
        *
        * Step 2
        * Match Make using an algo of rating.
        *
        * Step 3
        * Update their status about match making.
        *
        * */
        return new ArrayList<>();


    }
}
