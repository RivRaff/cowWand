package rivraff.com.github.cowwand;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FireCowCommand  implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if(player.isOp()) {

                } else {
                    player.sendMessage("You must be an operator to use this command.");
                    System.out.println(player.getName() + " is not an operator, so the command did not execute.");
                }
            } else {

            }




        return true;

    }
}
