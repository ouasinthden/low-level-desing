### We are going to cover about the game design here. 

#### Services 
1. Match Making Service
2. LeaderBoard Service 
3. History Maintenance Service 

## Choosing Databases
### Why to use MYSQL here
Matching is kinda a graph algorithm ->  Stable Marriage problem!
Using MySQL for a matchmaking system like chess.com is a logical choice when you need transactional guarantees, reliable persistence, and flexible querying capabilities. MySQL can be optimized to handle high read and write workloads while supporting complex queries.
1. Match Making Service
   1. There should be tables like - 
      1. Player(`id`, `Name`, `Email`, `UserName`, `RATING`, `Status(ONLINE, PLAYING, ALIGNING, DISCONNECT)`)
      2. Game(`id`, `PLAYER_1`, `PLAYER_2`, `Winner`, `MARGIN`)
      3. MatchTable(`id`, `PLAYER_1`, `PLAYER_2`, `STATUS(IN_PROGRESS, ENDED) DEFAULT IN_PROGRESS`)