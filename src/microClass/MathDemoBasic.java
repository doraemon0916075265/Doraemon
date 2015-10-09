package microClass;

import globalService.GlobalValue;

public class MathDemoBasic {

	public static void main(String[] args) {
		GlobalValue USE = new GlobalValue();
		/** java.lang.Math **/
		System.out.println("※超越數");
		// PI
		double PI = Math.PI;
		System.out.println("PI = " + PI);
		// EXPONENTIAL
		double EXPONENTIAL = Math.E;
		System.out.println("E = " + EXPONENTIAL);

		int i1 = (int) ((Math.random() * 100) + 1);
		int i2 = (int) ((Math.random() * 10) + 1);
		int i3 = -1 * (int) (((Math.random() * 100) + 1));
		int i4 = i1 + i3;
		double d1 = (Math.random() * 20) + 1;
		double d2 = -1 * ((Math.random() * 10) + 1);

		USE.Demarcation();// 1
		System.out.println("※exponential的運算");
		double ExpPower = Math.exp(d1);
		double Expm1 = Math.expm1(d1);
		System.out.println("E^" + d1 + " = " + ExpPower + "\n(E^" + d1 + ")-1 = " + Expm1);
		// EXPONENTIAL的次方最靠近該數的整數
		int GetExponent = Math.getExponent(d1);
		System.out.println(GetExponent);

		USE.Demarcation();// 2
		System.out.println("※代數基本運算");

		// Signum=>取出性質符號
		double Signum = Math.signum(i4);
		System.out.println(i4 + " 的性質符號是 " + Signum);

		// negateExact=>變換性質符號
		int NegateExact = Math.negateExact(i4);
		System.out.println(i4 + " 的相反數是 " + NegateExact);

		// max、min=>比大小
		int Maximum = Math.max(i1, i3);
		int Minimum = Math.min(i1, i3);
		System.out.println(Maximum + ">" + Minimum);

		// abs=>絕對值
		int Abs01 = Math.abs(i1);
		int Abs02 = Math.abs(i3);
		System.out.println("|" + i1 + "| = " + Abs01 + "\n" + "|" + i3 + "| = " + Abs02);

		// addExact(x,y)=>x+y 相加
		int Add = Math.addExact(i1, i3);
		System.out.println(i1 + " + " + i3 + " = " + Add);

		// subtractExact(x,y)=>x-y 相差
		int SubtractExact = Math.subtractExact(i1, i3);
		System.out.println(i1 + " - " + i3 + " = " + SubtractExact);

		// multiplyExact(x,y)=>x*y 相乘
		int MultiplyExact = Math.multiplyExact(i1, i3);
		System.out.println(i1 + " * " + i3 + " = " + MultiplyExact);

		// floorDiv(x,y)=>x/y的商數 floorMod(x,y)=>x/y的餘數
		double FloorDiv = Math.floorDiv(Abs01, Abs02);
		double FloorMod = Math.floorMod(Abs01, Abs02);
		System.out.println("(" + Abs01 + " ÷ " + Abs02 + ") = " + FloorDiv + "..." + FloorMod);

		// IEEEremainder(x,y)=>x/y的餘數，餘數可能為負數
		double IEEEremainder = Math.IEEEremainder(i1, i3);
		System.out.println(i1 + " ÷ " + i3 + " ≒ " + IEEEremainder);

		// decrementExact=>輸入數值-1 incrementExact=>輸入數值+1
		int DecrementExact = Math.decrementExact(i3);
		int IncrementExact = Math.incrementExact(i3);
		System.out.println(i3 + " +1 = " + IncrementExact);
		System.out.println(i3 + " -1 = " + DecrementExact);

		// power(x,y)=>x的y次方
		double Pow = Math.pow(i1, i2);
		System.out.println("(" + i1 + ")^" + i2 + " = " + Pow);

		// sqrt=>開平方根
		double Sqrt = Math.sqrt(i1);
		System.out.println("根號(" + i1 + ") = " + Sqrt);

		// cbrt=>開立方根
		double cbrt = Math.cbrt(i1);
		System.out.println("立方根(" + i1 + ") = " + cbrt);

		// hypot(x,y)=>根號((x)^2+(y)^2)
		double Hypot = Math.hypot(i4, i2);
		System.out.println("根號((" + i4 + "^2)+(" + i2 + "^2)) = " + Hypot);

		// scalb(x,y)=>x*(2)^y
		double Scalb = Math.scalb(i1, i2);
		System.out.println(i1 + " * (2^" + i2 + ") = " + Scalb);

		// ceil=>大於或等於指定的數值運算式之最小整數，無條件進位至整數
		// floor=>小於或等於指定的數值運算式之最大整數，無條件捨去至整數
		double ceil = Math.ceil(d1);
		double floor = Math.floor(d2);
		System.out.println("ceil  =\t" + ceil + "\nfloor =\t" + floor);

		// rint=>最接近輸入數的整數值，小數第一位>5 要進位
		// round=>最接近輸入數的整數值，小數第一位>=5 要進位
		double Rint = Math.rint(d2);
		double Round = Math.round(d2);
		System.out.println("rint  =\t" + Rint + "\nround =\t" + Round);

		// random=>隨機回傳[0,1)之間的浮點數
		double Random = Math.random();
		System.out.println("隨機亂數 ： " + Random);

		// copySign(x,y)=>回傳y的性質符號和x的數值
		double CopySign = Math.copySign(i3, Abs01);
		System.out.println(CopySign);

		// nextAfter(x,y)=>x，y之間靠近x的浮點數
		// nextDown(x)=>比x大且靠近x的浮點數 nextUp(x)=>比x小且靠近x的浮點數
		double NextAfter = Math.nextAfter(d1, d2);
		double NextDown = Math.nextDown(d1);
		double NextUp = Math.nextUp(d1);
		System.out.println(NextAfter + "\n" + NextDown + "\n" + NextUp);

		// ToRadians=>角度轉成弧度 ToDegrees=>弧度轉成角度
		double ToDegrees = Math.toDegrees(Abs01);
		double ToRadians = Math.toRadians(Abs01);
		System.out.println(ToDegrees + "\n" + ToRadians);

		USE.Demarcation();// 3
		System.out.println("※對數");
		double logexp = Math.log(d1);
		double log10 = Math.log10(d1);
		double log1p = Math.log1p(d1);
		System.out.println("log以e為底數 = " + logexp + "\nlog以10為底數 = " + log10 + "\nlog以e為底數且輸入數-1 = " + log1p);

		USE.Demarcation();// 4
		System.out.println("※三角函數\tPS:輸入錯誤回傳NaN");
		double d01 = Math.random();
		double d02 = d2 = -1 * (Math.random());
		double d03 = Math.random();

		// hyperbolic
		double Sinh = Math.sinh(d01);
		double Cosh = Math.cosh(d01);
		double Tanh = Math.tanh(d01);
		System.out.println("Sinh = " + Sinh + "\nCosh = " + Cosh + "\nTanh = " + Tanh);

		// ArcSine 輸入範圍[-1,1]=>回傳範圍[-(PI/2),(PI/2)]
		double ArcSine = Math.asin(d02);
		System.out.println("ArcSin = " + ArcSine);

		// ArcCosine 輸入範圍[-1,1]=>回傳範圍[0,PI]
		double ArcCosine = Math.acos(d01);
		System.out.println("ArcCos = " + ArcCosine);

		// ArcTangent 輸入範圍[實數]=>回傳範圍( -(PI/2),(PI/2) )
		// atan2(x,y) x=>到x軸距離，y=>到y軸距離 回傳範圍( -(PI/2),(PI/2) )
		double ArcTangent = Math.atan(d03);
		double ArcTangentPlane = Math.atan2(1, 1);
		System.out.println("ArcTan = " + ArcTangent);
		System.out.println(ArcTangentPlane);

	}

	private void getDemarcation() {
		// TODO Auto-generated method stub

	}
}
