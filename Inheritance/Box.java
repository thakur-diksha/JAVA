package inheritance;

public class Box {
    float width;
    float height;
    float depth;
    public Box()
    {
        width= height= depth=0.0f;
    }
      public Box(float width,float height,float depth)
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    @Override
    public String toString(){
        return "Width="+width+"\nheight= "+height+"\nDepth= "+depth;
    }
}
class ColorBox extends Box{
    String color;
    public ColorBox(){
        super();
        color=null;
    }
     public ColorBox(float width,float height,float depth,String color)
    {
        super(width,height,depth);
        this.color=color;
    }
     public String toString(){
         return (super.toString()+"\n Color="+color);
     }
}
class TestColorBox{
    public static void main(String args[]){
        ColorBox cb1=new ColorBox();
        ColorBox cb2=new ColorBox(4,6,2,"Red");
        System.out.println("Objec cb1");
        System.out.println(cb1);
         System.out.println();
                 System.out.println("Objec cb2");
        System.out.println(cb2);         


    }
}
/*run:
Objec cb1
Width=0.0
height= 0.0
Depth= 0.0
 Color=null

Objec cb2
Width=4.0
height= 6.0
Depth= 2.0
 Color=Red
BUILD SUCCESSFUL (total time: 2 seconds) */