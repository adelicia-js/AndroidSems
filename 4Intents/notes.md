1. Packages to import:
    - android.content.Intent
    - android.widget.Button 
    - android.widget.Toast
    - android.net.Uri (for implicit intents)

2. Explicit Intent Syntax:

        explicitBtn.setOnClickListener(v -> {
            Intent explicitIntent = new Intent(getBaseContext(), SecondActivity.class);
            startActivity(explicitIntent);
        });

3. Implicit Intent Syntax:

        implicitBtn.setOnClickListener(v -> {
            Intent implicitIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.website_url.com"));
            startActivity(implicitIntent);
        });

[Back to Index](../README.md)
