public class Triangle {
    double Base;
    double Height;
    double SideLengthOne;
    double SideLengthTwo;
    double SideLengthThree;

    public Triangle(double Base, double Height, 
                    double SideLengthOne, double SideLengthTwo, double SideLengthThree){
        this.Base = Base;
        this.Height = Height;
        this.SideLengthOne = SideLengthOne;
        this.SideLengthTwo = SideLengthTwo;
        this.SideLengthThree = SideLengthThree;
    }
    
    public double FindArea(){
        return (this.Base * this.Height) * 0.5;
    }

}
