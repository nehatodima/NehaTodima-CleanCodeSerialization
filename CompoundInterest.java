class CompoundInterest
{
	CompoundInterest(float p,float r,float t)
  		{
 			double CI = p * (Math.pow((1 + r/ 100), t)); 
  			System.out.println("Compound Interest is "+ CI); 
		}
}
