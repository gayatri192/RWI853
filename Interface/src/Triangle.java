class Triangle extends Rectangle implements Area
{

	float l = 0,b = 0,T_calculate=0;
	
	 public void calculate()
     {
     	 l=11.5F;
         b=8.3F;
         T_calculate = l*b;
         System.out.println("Area of Triangle =" +T_calculate);
     }


}


