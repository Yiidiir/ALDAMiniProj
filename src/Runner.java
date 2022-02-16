public class Runner {
    public static void main(String[] args) {
        String[] commande = new String[3];
        String argument = "";
        argument = argument + "Agent1:BlockchainAgent";
        argument = argument + ";Agent2:BlockchainAgent";
        argument = argument + ";Agent3:BlockchainAgent";
        argument = argument + ";Agent4:BlockchainAgent";
        argument = argument + ";Agent5:BlockchainAgent";
        argument = argument + ";Agent6:BlockchainAgent";
//        argument = argument + ";Agent7:BlockchainAgent";
//        argument = argument + ";Agent8:BlockchainAgent";
//        argument = argument + ";Agent9:BlockchainAgent";
//        argument = argument + ";Agent10:BlockchainAgent";
//        argument = argument + ";Agent11:BlockchainAgent";
//        argument = argument + ";Agent50:BlockchainAgent";
//argument = argument+";AgU2:AgentUtilisateur(AgCalcul, 79, 123, *)";
        commande[0] = "-cp";
        commande[1] = "jade.boot";
        commande[2] = argument;
        jade.Boot.main(commande);
    }

}
