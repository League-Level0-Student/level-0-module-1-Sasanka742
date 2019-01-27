void setup() {
    size(500, 500);
}
void draw() {
    background(255, 255, 255);
    noStroke();
    
    fill(242,0,0);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    
    fill(5,165,6);
    rect(176, 103, 12, 32);
    
    if(mousePressed){
      fill(255,255,255);
      ellipse(70,200,50,50);
    }
}