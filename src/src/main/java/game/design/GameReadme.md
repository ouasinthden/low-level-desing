#### We are going to cover about the chess(mainly) game design here.<br>
#### Services 
1. Match Making Service
2. LeaderBoard Service 
3. History Maintenance Service
4. User Management Serivce 


1. Match Making Service
   1. <em>Functional Requirements</em>
      1. User should be able to match with :-
         1. Rating based 
         2. Wait time based
      2. User should have preference like black and white team selection
      3. System should be available 
      4. System should be faulted tolerance.
   2. There should be tables like - 
        1. Player(`id`, `Name`, `Email`, `UserName`, `RATING`, `Status(ONLINE, PLAYING, ALIGNING, DISCONNECT)`)
        2. Game(`id`, `PLAYER_1`, `PLAYER_2`, `Winner`, `MARGIN`)
        3. MatchTable(`id`, `PLAYER_1`, `PLAYER_2`, `STATUS(IN_PROGRESS, ENDED) DEFAULT IN_PROGRESS`)
      ## Choosing Databases
      ### Why to use MYSQL here
      Matching is kinda a graph algorithm ->  Stable Marriage problem!
      Using MySQL for a matchmaking system like chess.com
      is a logical choice when you need transactional guarantees, reliable persistence, and flexible
      querying capabilities. MySQL can be optimized to handle high read and write workloads while
      supporting complex queries.<br><br>


2. **LeaderBoard Service Design**
   1. **<em>Functional Requirements</em>**
      1. User should be able to open the leaderboard
         1. <em>Time-based ranking
         2. Region based ranking 
         3. Overall ranking</em>
      2. User should be able to see his ranking, points and position
      3. User should be able to see stats of every player
      4. System should be **available**
      5. System should be **partition tolerance**
   2. **<em> Database Design</em>**
      * Now powering leaderboard is tricky as there might be a lot of filters, and having a new column for each filter might be little over the top for mySql. 
      * Here you should ask about can my system take some time to process the recent game ?
      * If he says **"No we can skip the real time"**
        * Great, now it's time to introduce Elasticsearch, but why ??
          * Filters 
          * Range Queries 
          * Sorting 
          * Time based queries
        * Sounds like a perfect fit !!
      * This is it !
      * Schema - 
      ```json
      {
        "leaderBoardId" : "1",
        "playerId" : 1,
        "wins" : 1, 
        "loses" : 20,
        "draw" : 20,
        "rank" : 2012,
        "rating" : 200,
        "streak" : 20
      }
      ```