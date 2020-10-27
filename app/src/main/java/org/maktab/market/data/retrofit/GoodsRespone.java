package org.maktab.market.data.retrofit;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import org.maktab.market.data.retrofit.respone.CollectionItem;
import org.maktab.market.data.retrofit.respone.SelfItem;

public class GoodsRespone {

	@SerializedName("self")
	private List<SelfItem> self;

	@SerializedName("collection")
	private List<CollectionItem> collection;

	public List<SelfItem> getSelf(){
		return self;
	}

	public List<CollectionItem> getCollection(){
		return collection;
	}
}