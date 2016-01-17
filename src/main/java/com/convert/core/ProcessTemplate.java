package com.convert.core;

import java.util.LinkedList;
import java.util.List;

public class ProcessTemplate {
  private Settings settings;
  private List<Process> processes = null;

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

  public void execute() {
    for (Process process : processes) {
      process.invoke();
    }
  }

  public ProcessTemplate addProcess(Process process) {
    if (processes == null) {
      processes = new LinkedList<Process>();
    }
    process.setSettings(settings);
    processes.add(process);
    return this;
  }

}
