import java.util.List;

public class Team {

    private int code;
    private List<Player> listPlayers;

    public Team(){
        System.out.println("Constructor created \n");
    }

    public void addPlayer(Player player){
        listPlayers.add(player);
    }
}
