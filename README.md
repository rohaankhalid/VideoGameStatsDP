## Design Problem

You are a video game designer working on an online multiplayer game. You want to implement a system where you can keep track of the attributes of each player and quickly increase player stats as they level up. The players will each have a unique username and each player will have a variety of stats that each have their own value. You want to be able to quickly switch between players, and access their stats to increase them when they unlock new achievements and levels.

## Clarifications or Questions

- How many players and stats do we anticipate handling?
- What are the expected ranges for player stats?
- Will the system need to handle concurrrent updates to player stats?
- Are all stats numerical, or are there different types of stats?
- How will the stats be displayed to the players?
- How flexible does the system need to be to accommodate future changes, such as adding new stats or changing how stats are calculated?

## Design Decisions and Assumptions

- **Data Structure:** The ideal ADT would be a Map. Specifically, a HashMap where the key is the player's unique username and the value is another HashMap holding the player's stats. The inner Map would have the stat names as keys and their values as values.
- **Extensibility:** The `PlayerStats` class allows for future expansions, like adding methods to modify stats in different ways.
- **Error Handling:** Returns 0 for non-existent usernames and stats. This behavior can be modified on requirements.
