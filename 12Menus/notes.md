1. Create a menu file `menu_name.xml` in `src/main/res/menu` folder. (will have to create the menu folder).

2. XML syntax for a menu
        
        <menu 
            xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
        >

            <item 
                android:id="@+id/menu_name" 
                android:title="menuName" 
                app:showAsAction="ifRoom"
            >

                <menu>

                    <item 
                        android:id="@+id/item_name"
                        android:title="itemName"
                        app:showAsAction="never"
                    />
                    
                    <!-- add more items if needed -->

                </menu>

        </menu>

3. Go to the themes files in `app/res/values/themes` & remove `.NoActionBar` from the end of the parent in the `<style>` element.

4. Packages to import:
    - androidx.annotation.NonNull
    - android.view.Menu
    - android.view.MenuInflater
    - android.view.MenuItem
    - android.widget.Toast 

5. Define method to inflate menu

        @Override
        public boolean onCreateOptionsMenu(Menu menu){
            MenuInflater inflater = getInflater();
            inflater.inflate(R.menu.menu_name, menu);
            return true;
        }

6. Define method to allow users to navigate between items

        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item) {

            int itemId = item.getItemId();

            if(itemId == R.id.item_name_1) {
                
                // do something
            
            } 
            
            else if(itemId == R.id.item_name_2) {
            
                // do something
            
            }

            return super.onOptionsItemSelected(item);

        }
