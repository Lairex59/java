class Polsterung
{
	private String pMaterial;
	private String pFarbe;

	public String getPMaterial() {
		return pMaterial;
	}

	public void setPMaterial(String pMaterial) {
		if (pMaterial != null) {
			this.pMaterial = pMaterial;
		}
	}

	public String getPFarbe() {
		return pFarbe;
	}

	public void setPFarbe(String pFarbe) {
		if (pFarbe != null) {
			this.pFarbe = pFarbe;
		}
	}

	public Polsterung clone() {
		Polsterung ret = new Polsterung();
		ret.setPMaterial(this.pMaterial);
		ret.setPFarbe(this.pFarbe);
		return ret;
	}

	public boolean equals(Object obj) {
		boolean ret = false;
		if (obj instanceof Polsterung) {
			Polsterung o = (Polsterung) obj;
			ret = o.pMaterial.equals(this.pMaterial) && o.pFarbe.equals(this.pFarbe);
		}
		return ret;
	}

	public int compareTo(Polsterung o) {
		int ret = o.pMaterial.compareTo(this.pMaterial);
		if (ret == 0) {
			ret = o.pFarbe.compareTo(this.pFarbe);
		}
		return ret;

	}

}