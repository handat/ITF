package jp.handatec.itf;

import java.util.HashMap;
import java.util.List;

public class DataPatternList {

	private HashMap<String, DataPattern> map;
	private List<DataPattern> list;

	//コンストラクタ
	public DataPatternList() {
		map = new HashMap<String, DataPattern>();
	}

	//コンストラクタ
	public DataPatternList(List<DataPattern> l_dp) {
		map = new HashMap<String, DataPattern>();
		createDPL(l_dp);
	}

	//DataPatternのListからMAPを作成
	public void createDPL(List<DataPattern> l_dp) {
		list = l_dp;
		for (DataPattern dp : l_dp) {
			//MAPへ登録
			map.put(dp.getId(), dp);
		}
	}

	//データパターン文字列を取得
	public String getDataPatternString(String id) {
		String result = null;
		if (map != null) {
			result = map.get(id).getPattern();
		}

		return result;
	}

	//データパターンオブジェクトを取得
	public DataPattern getDataPattern(String id) {
		DataPattern result = null;
		if (map != null) {
			result = map.get(id);
		}
		return result;
	}

}
