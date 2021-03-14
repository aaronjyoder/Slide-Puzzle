package com.aaronjyoder.slide.puzzle;

import java.awt.Point;
import java.awt.image.BufferedImage;

public class Piece {

  private final BufferedImage image;
  private final Point pos;
  private boolean isBlank;

  public Piece(BufferedImage image, Point pos) {
    this.image = image;
    this.pos = pos;
    isBlank = false;
  }

  public BufferedImage getImage() {
    return image;
  }

  public Point getPosition() {
    return pos;
  }

  public boolean isBlank() {
    return isBlank;
  }

  public void setPosition(int x, int y) {
    this.pos.setLocation(x, y);
  }

  public void setBlank(boolean blank) {
    this.isBlank = blank;
  }

}
