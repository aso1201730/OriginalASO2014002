package jp.ac.st.asojuku.original2014002;

import jp.ac.st.asojukuoriginal2014002.R;


public class MaintenanceActivity extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {

@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ

	}

	{
	SQLiteDatabase sdb = null;
	MySQLiteOpenHelper helper = null;
int selectedID = -1;
int lastPosition = -1;
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maintenanceactivity);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		Button btnDelete = (Button)findViewById(R.id.btn_dl);
		Button btnMainte_Back = (Button)findViewById(R.id.btn_back);
		ListView lstHitokoto = (ListView)findViewById(R.id.list_hitokoto);


		btnDelete.setOnClickListener(this);
		btnMainte_Back.setOnClickListener(this);
		lstHitokoto.setOnItemClickListener(this);

		this.setDBValuetoList(lstHitokoto);

	}

private void setDBValuetoList(ListView lstHitokoto) {
	SQLiteCursor cursor = null;

	if(sdb==null) {
		helper.getVritableDaabas();
	}
	try{
		sdb = helper.getVritableDatabase();
	}catch(SQLiteException e){
		Log.e("EEROR",e.toString());
	}

	cursor = this.helper.selectHitokotoList(sdb);

	int db_layout = android.R.layout.simple_list_item_activated_1;

String[]from = {"phrese"};

int[] to = new int[]{android.R.id.text1};

SimpleCursorAdapter =
			new SimpleCursorAdapter(this,db_layout,curosr,from,to,0);

lstHitokoto.setAdapter(adapter);
}

}