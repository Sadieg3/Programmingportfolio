class Car {
  //Member Variables
  color c;
  float x, y, speed;
  boolean right;

  //Constructor
  Car(float tempX, float tempY) {
    c=color(random(256), random(256), random(256));
    x=tempX;
    y=tempY;
    speed= random(1, 6);
    if (int(random(2))==0) {
      right=true;
    } else {
      right= false;
    }
  }
  //Method for Display
  void display() {
    fill(0);
    rect(x+4, y-3, 7, 4);
    rect(x+4, y+9, 7, 4);
    rect(x+22, y-3, 7, 4);
    rect(x+20, y+9, 7, 4);
    fill(c);
    rect(x, y, 30, 10);
  }

  //Method for Movement
  void move() {
    x = x + speed;
    if (x > width) {
      x = 0;
    } else if (x<0) {
      x=width;
    }
  }
}
