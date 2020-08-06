package com.dicoding123.picodiploma.myrecyclerview.model

import com.dicoding123.picodiploma.myrecyclerview.R

object SuperfoodsData {
    private val superfoodsNames = arrayOf(
        "Berries",
        "Dark Leafy Green",
        "Eggs",
        "Garlic",
        "Ginger",
        "Green Tea",
        "Kefir and Yogurt",
        "Legumes",
        "Nuts and Seeds",
        "Olive Oil"
    )

    private val superfoodDetails = arrayOf(
        "Berries are a nutritional powerhouse of vitamins, minerals, fiber and antioxidants.",
        "Dark green leafy vegetables (DGLVs) are an excellent source of nutrients including folate, zinc, calcium, iron, magnesium, vitamin C and fiber.",
        "Eggs have historically been a controversial topic in the nutrition world due to their high cholesterol content, but they remain one of the healthiest foods.",
        "Garlic is a plant food that is closely related to onions, leeks and shallots. It’s a good source of manganese, vitamin C, vitamin B6, selenium and fiber.",
        "Ginger comes from the root of a flowering plant from China. It’s used as both a culinary flavor enhancer and for its multiple medicinal effects.",
        "Originally from China, green tea is a lightly caffeinated beverage with a wide array of medicinal properties.",
        "Kefir is a fermented beverage usually made from milk that contains protein, calcium, B vitamins, potassium and probiotics.",
        "Legumes, or pulses, are a class of plant foods made up of beans (including soy), lentils, peas, peanuts and alfalfa.",
        "Nuts and seeds are rich in fiber, vegetarian protein and heart-healthy fats.",
        "Olive oil is a natural oil extracted from the fruit of olive trees and one of the mainstays of the Mediterranean diet."
    )

    private val superfoodDesc = arrayOf(
        "The strong antioxidant capacity of berries is associated with a reduced risk of heart disease, cancer and other inflammatory conditions.\n" +
                "\n" +
                "Berries may also be effective in treating various digestive and immune-related disorders when used alongside traditional medical therapies.\n" +
                "\n" +
                "Some of the most common berries include:\n" +
                "\n" +
                "Raspberries\n" +
                "Strawberries\n" +
                "Blueberries\n" +
                "Blackberries\n" +
                "Cranberries\n" +
                "Whether you enjoy them as part of your breakfast, as a dessert, on a salad or in a smoothie, the health benefits of berries are as versatile as their culinary applications.",
        "Part of what makes DGLVs so super is their potential to reduce your risk of chronic illnesses including heart disease and type 2 diabetes.\n" +
                "\n" +
                "They also contain high levels of anti-inflammatory compounds known as carotenoids, which may protect against certain types of cancer (3Trusted Source).\n" +
                "\n" +
                "Some well-known DGLVs include:\n" +
                "\n" +
                "Kale\n" +
                "Swiss chard\n" +
                "Collard greens\n" +
                "Turnip greens\n" +
                "Spinach\n" +
                "Some DGLVs have a bitter taste and not everyone enjoys them plain. You can get creative by including them in your favorite soups, salads, smoothies, stir-fries and curries.",
        "Whole eggs are rich in many nutrients including B vitamins, choline, selenium, vitamin A, iron and phosphorus.\n" +
                "\n" +
                "They’re also loaded with high-quality protein.\n" +
                "\n" +
                "Eggs contain two potent antioxidants, zeaxanthin and lutein, which are known to protect vision and eye health.\n" +
                "\n" +
                "Despite fears surrounding egg consumption and high cholesterol, research indicates no measurable increase in heart disease or diabetes risk from eating up to 6–12 eggs per week.\n" +
                "\n" +
                "In fact, eating eggs could increase “good” HDL cholesterol in some people, which may lead to a favorable reduction in heart disease risk. More research is needed to draw a definite conclusion",
        "Garlic is a popular culinary ingredient due to its distinct flavor, but it has also been used for its medicinal benefits for centuries.\n" +
                "\n" +
                "Research indicates that garlic may be effective in reducing cholesterol and blood pressure, as well as supporting immune function.\n" +
                "\n" +
                "What’s more, sulfur-containing compounds in garlic may even play a role in preventing certain types of cancer.",
        "Ginger root contains antioxidants, such as gingerol, that may be responsible for many of the reported health benefits associated with this food.\n" +
                "\n" +
                "Ginger may be effective for managing nausea and reducing pain from acute and chronic inflammatory conditions.\n" +
                "\n" +
                "It may also reduce your risk of chronic illnesses such as heart disease, dementia and certain cancers.\n" +
                "\n" +
                "Ginger is available fresh, as an oil or juice and in dried/powdered forms. It’s easy to incorporate into soups, stir-fries, sauces and teas.",
        "EGCG is likely what gives green tea its apparent ability to protect against chronic diseases including heart disease, diabetes and cancer\n" +
                "\n" +
                "Research also indicates that the combination of catechins and caffeine in green tea may make it an effective tool for weight loss in some people.",
        "Kefir is similar to yogurt but has a thinner consistency and typically more probiotic strains than yogurt.\n" +
                "\n" +
                "Fermented, probiotic-rich foods like kefir have several associated health benefits, including reduced cholesterol, lowered blood pressure, improved digestion and anti-inflammatory effects.\n" +
                "\n" +
                "Though kefir is traditionally made from cow’s milk, it’s typically well tolerated by people with lactose intolerance due to the fermentation of the lactose by bacteria.\n" +
                "\n" +
                "However, it’s also made from non-dairy beverages such as coconut milk, rice milk and coconut water.\n" +
                "\n" +
                "You can purchase kefir or make it yourself. If you’re choosing a commercially prepared product, be mindful of added sugar.",
        "They earn the superfood label because they’re loaded with nutrients and play a role in preventing and managing various diseases.\n" +
                "\n" +
                "Legumes are a rich source of B vitamins, various minerals, protein and fiber.\n" +
                "\n" +
                "Research indicates that they offer many health benefits including improved type 2 diabetes management, as well as reduced blood pressure and cholesterol.\n" +
                "\n" +
                "Eating beans and legumes regularly may also promote healthy weight maintenance, due to their ability to improve feelings of fullness.",
        "They also pack various plant compounds with anti-inflammatory and antioxidant properties, which can protect against oxidative stress .\n" +
                "\n" +
                "Research indicates that eating nuts and seeds can have a protective effect against heart disease.\n" +
                "\n" +
                "Common nuts and seeds include:\n" +
                "\n" +
                "Almonds, pecans, pistachios, walnuts, cashews, Brazil nuts, macadamia nuts.\n" +
                "Peanuts — technically a legume, but often considered a nut.\n" +
                "Sunflower seeds, pumpkin seeds, chia seeds, flaxseeds, hemp seeds.\n" +
                "Interestingly, even though nuts and seeds are calorically dense, some types of nuts are linked to weight loss when included in a balanced diet.",
        "It’s biggest claims to health are its high levels of monounsaturated fatty acids (MUFAs) and polyphenolic compounds.\n" +
                "\n" +
                "Adding olive oil to your diet may reduce inflammation and your risk of certain illnesses such as heart disease and diabetes .\n" +
                "\n" +
                "It also contains antioxidants such as vitamins E and K, which can protect against cellular damage from oxidative stress."
    )

    private val superfoodsImagesHome = intArrayOf(
        R.drawable.berries_1,
        R.drawable.dark_leafy_green_1,
        R.drawable.eggs_1,
        R.drawable.garlic_1,
        R.drawable.ginger_1,
        R.drawable.green_tea_1,
        R.drawable.kefir_and_yoghurt_1,
        R.drawable.legumes_1,
        R.drawable.nuts_and_seeds_1,
        R.drawable.olive_oil_1
    )

    private val superfoodsImagesDetail = arrayOf(
        "berries_2",
        "dark_leafy_green_2",
        "eggs_2",
        "garlic_2",
        "ginger_2",
        "green_tea_2",
        "kefir_and_yoghurt_2",
        "legumes_2",
        "nuts_and_seeds_2",
        "olive_oil_2"
    )

    val listData: ArrayList<Superfood>
        get() {
            val list = arrayListOf<Superfood>()
            for (position in superfoodsNames.indices) {
                val superfood = Superfood()
                superfood.name = superfoodsNames[position]
                superfood.detail = superfoodDetails[position]
                superfood.desc = superfoodDesc[position]
                superfood.photoHome = superfoodsImagesHome[position]
                superfood.photoDetail = superfoodsImagesDetail[position]
                list.add(superfood)
            }
            return list
        }
}