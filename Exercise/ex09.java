// this is a child class of the parent pet.java. this is inheritance
public class dog extends Pet{ // this is inheritance
 //date fields
 private String breed;
 private boolean boostershot;
 //methods constructor has no return value
 public dog(){
 //name="No name yet";// name variable in the parent class was private.
 //setName("No name yet");
 super();// involking the default constructor because there is no arguments there
 breed=" None";
 boostershot=false;
 }
 public dog(String initName, int initage,double initweight,String initBreed, boolean initboostershot){
 super(initName,initage,initweight);
 breed=initBreed;
 boostershot=initboostershot;
 }
 //mutator method
 public void setBreed(String breed){
 this.breed=breed;// this refers to dog
 }
 public void setBoostershot(boolean boostershot){
 this.boostershot=boostershot;
 }
 //accessor
 public String getBreed(){
 return breed;
 }
 public boolean getBoostershot(){
 return boostershot;
 }
 //overide the parent class that has the same writeOutput
 public void writeOutput(){
 super.writeOutput();
 System.out.println("Breed"+breed);
 System.out.println("Booster shot: "+boostershot);
 }
}
