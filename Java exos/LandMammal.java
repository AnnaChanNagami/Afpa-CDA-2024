public abstract class Animal {
  private String species;
  private String ecosystem;

  public Animal(String species, String ecosystem) {
      this.species = species;
      this.ecosystem = ecosystem;
  }

  public String getSpecies() {
      return species;
  }

  public void setSpecies(String species) {
      this.species = species;
  }

  public String getEcosystem() {
      return ecosystem;
  }

  public void setEcosystem(String ecosystem) {
      this.ecosystem = ecosystem;
  }

  @Override
  public String toString() {
      return "Species: " + species + ", Ecosystem: " + ecosystem;
  }

  public abstract void displayLocomotionType();
}
public class LandMammal extends Animal {
  private String furColor;

  public LandMammal(String species, String ecosystem, String furColor) {
      super(species, ecosystem);
      this.furColor = furColor;
  }

  public String getFurColor() {
      return furColor;
  }

  public void setFurColor(String furColor) {
      this.furColor = furColor;
  }

  @Override
  public String toString() {
      return super.toString() + ", Fur Color: " + furColor;
  }

  @Override
  public void displayLocomotionType() {
      System.out.println("Marche/course/saut");
  }
}
public class Bird extends Animal {
    private int wingSpan;

    public Bird(String species, String ecosystem, int wingSpan) {
        super(species, ecosystem);
        this.wingSpan = wingSpan;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return super.toString() + ", Wing Span: " + wingSpan + " cm";
    }

    @Override
    public void displayLocomotionType() {
        System.out.println("Vol");
    }
}
public class Fish extends Animal {
    private int preferredWaterDepth;

    public Fish(String species, String ecosystem, int preferredWaterDepth) {
        super(species, ecosystem);
        this.preferredWaterDepth = preferredWaterDepth;
    }

    public int getPreferredWaterDepth() {
        return preferredWaterDepth;
    }

    public void setPreferredWaterDepth(int preferredWaterDepth) {
        this.preferredWaterDepth = preferredWaterDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", Preferred Water Depth: " + preferredWaterDepth + " cm";
    }

    @Override
    public void displayLocomotionType() {
        System.out.println("Nage");
    }
}
