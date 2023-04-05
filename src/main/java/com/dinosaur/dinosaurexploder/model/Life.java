package com.dinosaur.dinosaurexploder.model;
/**
 * Summary :
 *      This interface is to implement in  new playerClass for clean Understanding
 */
public interface Life {
    /**
     * Summary :
     *      This method runs for every frame like a continues flow , without any stop until we put stop to it.
     * Parameters :
     *      double ptf
     */
    public void onUpdate(double tpf);
    /**
     * Summary :
     *      This method return the life to the current life
     */
    public int getLife();
    /**
     * Summary :
     *      This method sets the life to the current life
     */
    public void setLife(int i);
    /**
     * Summary :
     *      This method decrease the life to the current life
     */
    public int decreaseLife(int i);
}