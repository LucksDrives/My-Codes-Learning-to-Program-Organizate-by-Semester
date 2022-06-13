byte state= LOW;
void setup() {
  pinMode(13, OUTPUT);
  pinMode(2, INPUT);
}


void loop() {
  if (digitalRead(2) == HIGH){ 
  while(digitalRead(2));
  state= !state;    
  }               
  digitalWrite(13, state);  
    }
