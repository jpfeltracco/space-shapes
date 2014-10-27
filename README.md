Space Shapes
============

###Setup
1. Fork and clone the repository!
2. Install [JDK 7+](http://www.oracle.com/technetwork/java/javase/downloads/index.html).
3. Install [IntelliJ (community edition)](https://www.jetbrains.com/idea/download/).
4. In IntelliJ:
    * File --> Import Project --> (Repo Directory)
    * Run --> Edit Configurations --> + button
        * Name: Desktop
        * Main class --> ... button --> DesktopLauncher
        * Working Directory --> ... button --> core/assets
        * Use classpath of module: --> desktop
    * To test your configuration: Run --> Run 'Desktop'

###Structure
* "core/src" contains all game code ("desktop/src" deals with launching the game on desktop, not game logic).
* "images/toPack" is the dump for any assets you need in game (not in the UI). They will be automatically packed and placed in "core/assets" for you to access in a TextureAtlas.
