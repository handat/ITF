package jp.handatec.itf;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class TestDataCreator {

	//データパターンファイルのパス
	static public String dpl_file_name;

	static {
		dpl_file_name = Messages.getString("DATAPTNFILE_PATH"); //$NON-NLS-1$
	}

	static public DataPatternList createData() {

		DataPatternList result = null;

		GsonBuilder gb = new GsonBuilder();
		Gson gs = gb.create();

		List<DataPattern> l_dp;
		Type collection_type = new TypeToken<List<DataPattern>>() {
		}.getType();

		FileReader fr;

		try {
			fr = new FileReader(dpl_file_name);

			l_dp = gs.fromJson(fr, collection_type);

			fr.close();

			DataPatternList dp_list = new DataPatternList();
			dp_list.createDPL(l_dp);
			result = dp_list;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

		return result;
	}

	public void toJsonTest() {

		GsonBuilder gb = new GsonBuilder();
		// 出力を成形
		gb.setPrettyPrinting();

		Gson gs = gb.create();

		DataPattern[] dpl = new DataPattern[2];

		DataPattern dp;

		dp = new DataPattern();
		dp.setId("001"); //$NON-NLS-1$
		dp.setInfo("ひらがな"); //$NON-NLS-1$
		dp.setPattern("あいうえお"); //$NON-NLS-1$
		dpl[0] = dp;

		dp = new DataPattern();
		dp.setId("002"); //$NON-NLS-1$
		dp.setInfo("半角数字"); //$NON-NLS-1$
		dp.setPattern("0123"); //$NON-NLS-1$
		dpl[1] = dp;

		System.out.println(gs.toJson(dpl));

	}
}
