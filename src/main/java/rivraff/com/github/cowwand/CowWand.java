package rivraff.com.github.cowwand;

import org.bukkit.plugin.java.JavaPlugin;

public final class CowWand extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("firecow").setExecutor(new FireCowCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        //Github test
    }
    public static class reference {
        static CowWand ref;
    }
}
