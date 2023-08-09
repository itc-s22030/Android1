package jp.ac.it_college.std.s22030.menusample

data class Menu(
    val name: String,
    val price: Int,
    val desc: String,
    )

val teisyokuList = listOf(
    Menu("唐揚げ定食", 800, "若鶏の唐揚げにサラダ、ご飯とお味噌汁が付きます。"),
    Menu("ハンバーグ定食", 850, "手ごねハンバーグにサラダ、ご飯とお味噌汁が付きます。"),
    Menu("生姜焼き定食", 850, "すりおろし生姜を使った生姜焼きにサラダ、ご飯とお味噌汁が付きます。"),
    Menu("ステーキ定食", 1000, "国産牛ステーキにサラダ、ご飯とお味噌汁が付きます。"),
    Menu("野菜炒め定食", 750, "季節の野菜炒めにサラダ、ご飯とお味噌汁が付きます。"),
    Menu("とんかつ定食", 900, "ロースとんかつにサラダ、ご飯とお味噌汁が付きます。"),
    Menu("ミンチかつ定食", 850, "手ごねミンチカツにサラダ、ご飯とお味噌汁が付きます。"),
    Menu("チキンカツ定食", 900, "ボリュームたっぷりチキンカツにサラダ、ご飯とお味噌汁が付きます。"),
    Menu("コロッケ定食", 850, "北海道ポテトコロッケにサラダ、ご飯とお味噌汁が付きます。"),
    Menu("回鍋肉定食", 750, "ピリ辛回鍋肉にサラダ、ご飯とお味噌汁が付きます。"),
    Menu("麻婆豆腐定食", 800, "本格四川麻婆豆腐にサラダ、ご飯とお味噌汁が付きます。"),
    Menu("青椒肉絲定食", 900, "ピーマンの香り豊かな青椒肉絲にサラダ、ご飯とお味噌汁が付きます。"),
    Menu("焼き魚定食", 850, "鰆の塩焼きにサラダ、ご飯とお味噌汁が付きます。"),
    Menu("焼肉定食", 950, "特製タレの焼肉にサラダ、ご飯とお味噌汁が付きます。"),
)

val curryList = listOf(
    Menu("ビーフカレー", 520, "特選のスパイスをきかせた国産ビーフ100%のカレーです。"),
    Menu("ポークカレー", 420, "特選のスパイスをきかせた国産ポーク100%のカレーです。"),
    Menu("ハンバーグカレー", 620, "特選のスパイスをきかせたカレーに手ごねハンバーグをトッピングです。"),
    Menu("チーズカレー", 560, "特選のスパイスをきかせたカレーにとろけるチーズをトッピングです。"),
    Menu("カツカレー", 760, "特選のスパイスをきかせたカレーに国産ロースカツをトッピングです。"),
    Menu("ビーフカレー", 880, "特選のスパイスをきかせたカレーに国産ビーフカツをトッピングです。"),
    Menu("唐揚げカレー", 540, "特選のスパイスをきかせたカレーに若鶏の唐揚げをトッピングです。"),
)