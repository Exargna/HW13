package Computer.Processor;

public class Processor {
   private ProcessorFrequency frequency;
   private ProcessorCores coresQuantity;
   private ProcessorMaker maker;
   private double weight;

   public Processor(ProcessorFrequency frequency, ProcessorCores coresQuantity, ProcessorMaker maker, double weight) {
      this.frequency = frequency;
      this.coresQuantity = coresQuantity;
      this.maker = maker;
      this.weight = weight;
   }

   public ProcessorFrequency getFrequency() {
      return frequency;
   }

   public void setFrequency(ProcessorFrequency frequency) {
      this.frequency = frequency;
   }

   public ProcessorCores getcoresQuantity() {
      return coresQuantity;
   }

   public void setcoresQuantity(ProcessorCores coresQuantity) {
      this.coresQuantity = coresQuantity;
   }

   public ProcessorMaker getMaker() {
      return maker;
   }


   public void setMaker(ProcessorMaker maker) {
      this.maker = maker;
   }

   public double getWeight() {
      return weight;
   }

   public void setWeight(double weight) {
      this.weight = weight;
   }

   @Override
   public String toString() {
      return "Computer.Processor.Processor{" +
              "frequency=" + frequency +
              ", coresQuantity=" + coresQuantity +
              ", maker=" + maker +
              ", weight=" + weight +
              '}';
   }
}
