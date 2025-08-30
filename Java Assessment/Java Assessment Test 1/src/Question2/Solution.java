package Question2;

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Player[] players = new Player[4];
        for (int i = 0; i < 4; i++) {
            int playerId = scan.nextInt();
            scan.nextLine();
            String playerName = scan.nextLine();
            int runs = scan.nextInt();
            scan.nextLine();
            String playerType = scan.nextLine();
            String matchType = scan.nextLine();
            players[i] = new Player(playerId, playerName, runs, playerType, matchType);
        }
        String givenPlayerType=scan.nextLine();
        String givenMatchType=scan.nextLine();
        int LowestRuns=findPlayerWithLowestRuns(players,givenPlayerType);
        if(LowestRuns!=0){
            System.out.println(LowestRuns);
        } else{
            System.out.println("No such player");
        }
        Player[] matchedPlayer = findPlayerByMatchType(players, givenMatchType);
        if (matchedPlayer != null) {
            for(int i=0;i<matchedPlayer.length;i++){
                System.out.println(matchedPlayer[i].getPlayerId());
            }
        }
        else{
            System.out.println("No player with given matchType");
        }
        scan.close();
    }
    public static int findPlayerWithLowestRuns(Player[] players, String givenPlayerType){
        int leastRuns=Integer.MAX_VALUE;
        for(Player ps: players){
            if(ps.getPlayerType().equalsIgnoreCase(givenPlayerType)) {
                leastRuns = Math.min(leastRuns, ps.getRuns());
            }
        }
        if(leastRuns==Integer.MAX_VALUE){
            return 0;
        }
        return leastRuns;
    }
    public static Player[] findPlayerByMatchType (Player[]players, String givenMatchType){
        ArrayList<Player> matchedPlayer = new ArrayList<>();
        for (Player ps : players) {
            if (ps.getMatchType().equalsIgnoreCase(givenMatchType)) {
                matchedPlayer.add(ps);
            }
        }
        if (matchedPlayer.isEmpty()) {
            return null;
        }
        matchedPlayer.sort(Comparator.comparing(Player::getPlayerId).reversed());
        return matchedPlayer.toArray(new Player[0]);
    }
}

class Player {
        private int playerId;
        private String playerName;
        private int runs;
        private String playerType;
        private String matchType;

        public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
            this.playerId = playerId;
            this.playerName = playerName;
            this.runs = runs;
            this.playerType = playerType;
            this.matchType = matchType;
        }
        public int getPlayerId() {
            return playerId;
        }
        public void setPlayerId(int playerId) {
            this.playerId = playerId;
        }
        public String getPlayerName() {
            return playerName;
        }
        public void setPlayerName(String playerName) {
            this.playerName = playerName;
        }
        public int getRuns() {
            return runs;
        }
        public void setRuns(int runs) {
            this.runs = runs;
        }
        public String getPlayerType() {
            return playerType;
        }
        public void setPlayerType(String playerType) {
            this.playerType = playerType;
        }
        public String getMatchType() {
            return matchType;
        }
        public void setMatchType(String matchType) {
            this.matchType = matchType;
        }
}