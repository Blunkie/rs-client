package accessors;

import callbacks.Callbacks;

public interface RSClient extends RSGameShell {
    RSPlayer getLocalPlayer();

    RSPlayer[] getPlayers();
    RSNpc[] getNPCs();

    Callbacks getCallbacks();
    void setCallbacks(Callbacks callbacks);

    int getCameraX();

    int getCameraY();

    int getCameraZ();

    int getCameraPitch();

    int getCameraYaw();

    void addMessage(int type, String sender, String text, String prefix);

    RSMouseHandler getMouseHandler_instance();
    RSKeyHandler getKeyHandler_instance();

    RSComponent getInterfaceComponents();

    int getDestinationX();

    int getDestinationY();

    int getKeyHandler_keyCodes();

    int[] getSkills_experienceTable();

    int[][][] getTiles_heights();

    byte[][][] getTiles_renderFlags();

    int[] getCurrentLevels();

    int[] getExperience();

    int getGameState();

    int getIsItemSelected();

    int[] getLevels();

    int getLoginState();


    //Menu stuff
    String[] getMenuActions();
    int[] getMenuArguments0();
    int[] getMenuArguments1();
    int[] getMenuArguments2();
    int getMenuHeight();
    int getMenuOpcodes();
    int getMenuOptionsCount();
    boolean getIsMiniMenuOpen();
    String[] getMenuTargetNames();
    int getMenuWidth();
    int getMenuX();
    int getMenuY();
    //Menu stuff done

    RSMouseRecorder getMouseRecorder();
    int[] getNpcIndices();
    RSNpc[] getNpcs();
    RSNodeDeque[][][] getObjStacks();
    RSNodeDeque getProjectiles();
    int getRunEnergy();

    RSScene[] getScene();
    RSScenery[] getScenery();

    String getSelectedItemName();
    String getSelectedSpellActionName();
    String getSelectedSpellName();

    boolean[][][][] getVisibilityMap();
    boolean[][] getVisibleTiles();
    int getWeight();
    RSWorldMap getWorldMap0();
    RSWorldMapEvent getWorldMapEvent();

    public int getMouseHandler_x();
    public int getMouseHandler_y();

    long getMouseHandler_lastPressedTimeMillis();

    int getMouseHandler_lastPressedX();

    int getMouseHandler_lastPressedY();


}