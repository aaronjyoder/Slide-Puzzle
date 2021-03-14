package com.aaronjyoder.slide;

import com.aaronjyoder.slide.puzzle.Puzzle;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.jthemedetecor.OsThemeDetector;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

  public static final OsThemeDetector themeDetector = OsThemeDetector.getDetector();

  public static final String PUZZLE_PATH = "res/puzzle/default.png";

  public static void main(String[] args) {
    if (themeDetector.isDark()) {
      FlatDarkLaf.install();
    } else {
      FlatLightLaf.install();
    }
    themeDetector.registerListener(isDark -> {
      if (isDark) {
        try {
          UIManager.setLookAndFeel(new FlatDarkLaf());
          FlatLaf.updateUI();
        } catch (UnsupportedLookAndFeelException e) {
          e.printStackTrace();
        }
      } else {
        try {
          UIManager.setLookAndFeel(new FlatLightLaf());
          FlatLaf.updateUI();
        } catch (UnsupportedLookAndFeelException e) {
          e.printStackTrace();
        }
      }
    });

    SwingUtilities.invokeLater(() -> {
      try {
        Puzzle puzzle = new Puzzle(PUZZLE_PATH, 4);
        puzzle.setVisible(true);
      } catch (Exception e) {
        System.exit(0);
      }
    });
  }

}