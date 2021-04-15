public class Schrank
{
	String material;
	double preis;
	int teile;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		if (material != null) {
			this.material = material;
		}
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public int getTeile() {
		return teile;
	}

	public void setTeile(int teile) {
		this.teile = teile;
	}
	
	public Schrank clone() {
		Schrank ret = new Schrank();
		
		ret.setMaterial(this.material);
		ret.setPreis(this.preis);
		ret.setTeile(this.teile);
		
		return ret;
	}
	
	public boolean equals(Object obj) {
		boolean ret = false;
		
		if (obj instanceof Schrank) {
			Schrank o = (Schrank)obj;
			
			ret = o.material.equals(this.material) &&
					o.teile == this.teile &&
					Math.abs(o.preis - this.preis) < Math.pow(10, -10);
		}
		
		return ret;
	}
	
	public int compareTo(Schrank o) {
    int ret = o.material.compareTo(this.material);
    if (ret == 0) {
        ret = o.teile - this.teile;
        if (ret == 0) {
            ret = (int)(Math.floor((o.preis - this.preis)*100000)/100000);
        }
    }
    return ret;
}
}