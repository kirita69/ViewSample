package com.websarva.wings.android.menusample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import androidx.appcompat.app.AppCompatActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private ListView _lvMenu;
    private List<Map<String, Object>> _menuList;
    private static final String[] FROM = {"name", "price"};
    private static final int[] TO = {R.id.tvMenuNameRow, R.id.tvMenuPriceRow};


    private List<Map<String,Object>> createCurryList(){
        List<Map<String,Object>> menuList = new ArrayList<>();
        Map<String,Object> menu = new HashMap<>();
        menu.put("name","ビーフカレー");
        menu.put("price",520);
        menu.put("desc","特選スパイスをきかせた国産ビーフ100%のカレーです。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","ポークカレー");
        menu.put("price",420);
        menu.put("desc","特選スパイスをきかせた国産ポーク100%のカレーです。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","野菜カレー");
        menu.put("price",320);
        menu.put("desc","特選スパイスをきかせた国産野菜100%のカレーです。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","鳥カレー");
        menu.put("price",420);
        menu.put("desc","特選スパイスをきかせた国産鳥100%のカレーです。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","焼肉カレー");
        menu.put("price",820);
        menu.put("desc","特選スパイスをきかせた焼肉100%のカレーです。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","馬肉カレー");
        menu.put("price",420);
        menu.put("desc","特選スパイスをきかせた国産馬肉100%のカレーです。");
        menuList.add(menu);
        return menuList;
    }

    private List<Map<String, Object>> createTeishokuList() {
        List<Map<String, Object>> menuList = new ArrayList<>();
        {
            Map<String, Object> menu = new HashMap<>();
//            menu = new HashMap<>();
            menu.put("name", "唐揚げ定食");
            menu.put("price", 850);
            menu.put("desc", "手ごねハンバーグにサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            menu = new HashMap<>();
            menu.put("name", "ハンバーグ定食");
            menu.put("price", 850);
            menu.put("desc", "手ごねハンバーグにサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            menu = new HashMap<>();
            menu.put("name", "お魚定食");
            menu.put("price", 750);
            menu.put("desc", "お魚さんにサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            menu = new HashMap<>();
            menu.put("name", "焼肉定食");
            menu.put("price", 850);
            menu.put("desc", "焼肉にサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            menu = new HashMap<>();
            menu.put("name", "ハンバーグ2定食");
            menu.put("price", 850);
            menu.put("desc", "手ごねハンバーグ2にサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            menu = new HashMap<>();
            menu.put("name", "ハンバーグ2定食");
            menu.put("price", 850);
            menu.put("desc", "手ごねハンバーグ2にサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            menu = new HashMap<>();
            menu.put("name", "ハンバーグ2定食");
            menu.put("price", 850);
            menu.put("desc", "手ごねハンバーグ2にサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            menu = new HashMap<>();
            menu.put("name", "ハンバーグ2定食");
            menu.put("price", 850);
            menu.put("desc", "手ごねハンバーグ2にサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            menu = new HashMap<>();
            menu.put("name", "ハンバーグ2定食");
            menu.put("price", 850);
            menu.put("desc", "手ごねハンバーグ2にサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            menu = new HashMap<>();
            menu.put("name", "ハンバーグ2定食");
            menu.put("price", 850);
            menu.put("desc", "手ごねハンバーグ2にサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            menu = new HashMap<>();
            menu.put("name", "ハンバーグ2定食");
            menu.put("price", 850);
            menu.put("desc", "手ごねハンバーグ2にサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            menu = new HashMap<>();
            menu.put("name", "ハンバーグ2定食");
            menu.put("price", 850);
            menu.put("desc", "手ごねハンバーグ2にサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            menu = new HashMap<>();
            menu.put("name", "ハンバーグ2定食");
            menu.put("price", 850);
            menu.put("desc", "手ごねハンバーグ2にサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);
        }
        return menuList;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean returnVal = true;
        int itemId = item.getItemId();

        if (itemId == R.id.menuListOptionTeishoku) {
            _menuList = createTeishokuList();
        } else if (itemId == R.id.menuListOptionCurry) {
            _menuList = createCurryList();
        } else {
            returnVal = super.onOptionsItemSelected(item);
        }

        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this, _menuList, R.layout.row, FROM, TO);
        _lvMenu.setAdapter(adapter);

        return returnVal;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _lvMenu = findViewById(R.id.lvMenu);
        _menuList = createTeishokuList();
        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this,_menuList,R.layout.row,FROM,TO);
        _lvMenu.setAdapter(adapter);
        _lvMenu.setOnItemClickListener(new ListItemClickListener());
//        EdgeToEdge.enable(this);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        registerForContextMenu(_lvMenu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_options_menu_list,menu);
        return true;
    }


    private class ListItemClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            Map<String,Object> item = (Map<String, Object>) parent.getItemAtPosition(position);
            order(item);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu,View view, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,view,menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_context_list,menu);
        menu.setHeaderTitle(R.string.menu_list_context_header);
    }

    private void order(Map<String,Object>menu){
        String menuName = (String) menu.get("name");
        Integer menuPrice = (Integer) menu.get("price");
        Intent intent = new Intent(MainActivity.this, MenuThanksActivity.class);
        intent.putExtra("menuName",menuName);
        intent.putExtra("menuPrice",menuPrice + "円");
        startActivity(intent);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        boolean returnVal = true;
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();

        int listPosition = info.position;
        Map<String,Object> menu = _menuList.get(listPosition);

        int itemId = item.getItemId();

        if (itemId == R.id.menuListContextDesc){
            String desc = (String) menu.get("desc");
            Toast.makeText(MainActivity.this,desc,Toast.LENGTH_LONG).show();
        } else if (itemId == R.id.menuListContextOder) {
            order(menu);
        }
        else {
            returnVal = super.onContextItemSelected(item);
        }

        return returnVal;
    }
}