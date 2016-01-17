package com.convert.core;

public abstract class Process {
  public abstract void invoke();

  private Settings settings;

  /**
   * @return the settings
   */
  public Settings getSettings() {
    return settings;
  }

  /**
   * @param settings
   *          the settings to set
   */
  public void setSettings(Settings settings) {
    this.settings = settings;
  }

}
