package javaProject.Lesson38;

@SuppressWarnings("unused")
public class VectorManip extends Tensor implements Vector {
	public VectorManip(double v[]) {
		iComp = v[0];
		jComp = v[1];
		kComp = v[2];
	}

	@Override
	public double dotProduct(double[] b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double[] crossProduct(double[] b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double absoluteValue(double[] b) {
		// TODO Auto-generated method stub
		return 0;
	}

	private double iComp, jComp, kComp;
}
