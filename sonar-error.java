public class ComplexMethod {

    public String intToEnglishValue(int i) {
        if (i == 1) {
            return "One";
        }
        if (i == 2) {
            return "Two";
        }
        if (i == 3) {
            return "Three";
        }
        if (i == 4) {
            return "Four";
        }
        if (i == 5) {
            return "Five";
        }
        if (i == 6) {
            return "Six";
        }
        if (i > 6) {
            throw new NotImplementedException();
        }
        return null;
    }
    
public enum Continent {

  NORTH_AMERICA (23, 24709000),
  EUROPE (50, 39310000);

  public int countryCount;  // Noncompliant
  private int landMass;

  Continent(int countryCount, int landMass) { 
    return null;
  }

  public void setLandMass(int landMass) {  // Noncompliant
    this.landMass = landMass;
  }
  
}
