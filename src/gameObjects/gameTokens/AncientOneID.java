package gameObjects.gameTokens;

public enum AncientOneID {

	AZATHOTH(AncientOne.Azathoth),
	SHUB_NIG(AncientOne.Shub_Nig),
	CTHULHU(AncientOne.Cthulhu),
	YOG_SOTH(AncientOne.Yog_Soth),
	YIG(AncientOne.Yig);
	
	public final AncientOne ancientOne_;
	
	private AncientOneID(AncientOne ancientOne) {
		ancientOne_ = ancientOne;
	}
	
}
