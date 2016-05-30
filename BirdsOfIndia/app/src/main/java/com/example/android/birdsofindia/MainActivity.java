package com.example.android.birdsofindia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.birdsofindia.models.BirdInfo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /* birds array to hold info on all birds */
    static public BirdInfo[][] birds;

    public static final String EXTRA_IS_QUIZ_TRIGGER = "com.example.android.birdsofindia.EXTRA_IS_QUIZ_TRIGGER";
    /* birdType is kept global to be accessible when filling the birdsInfo activity */
    static public int birdType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * Function to populate the birds array with info for all birds
         */
        getBirdsData();
    }


    /**
     * Launches the Explore view
     *
     * @param view
     */
    public void explore(View view) {
        Intent intent = new Intent(this, ExploreActivity.class);
        startActivity(intent);
    }

    /**
     * TODO - next version
     * @param view
     */
//    public void search(View view) {
//        Intent intent = new Intent(this, SearchActivity.class);
//        startActivity(intent);
//    }
//

    /**
     * TODO - next version
     *
     * @param view
     */
    public void quiz(View view) {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }

    /**
     * Launch the About screen
     *
     * @param view
     */
    public void aboutUs(View view) {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    /**
     * Helper function to get the resource Id of the passed image name
     *
     * @param imgName
     * @return Resource Id
     */
    public int getImgResId(String imgName) {
        return getResources().getIdentifier(imgName, "drawable", getPackageName());
    }

    /**
     * Main data fetching function to get the info (@link BirdInfo) about all the birds
     */
    private void getBirdsData() {

        /* currently having 7 bird categories only */
        birds = new BirdInfo[7][];
        birds[0] = new BirdInfo[]{
                new BirdInfo(getImgResId("flamingo_gr"),
                        "Greater Flamingo",
                        "Phoenicopterus roseus",
                        "This is the largest species of flamingo, averaging 110–150 cm (43–59 in) tall and weighing 2–4 kg (4.4–8.8 lb). " +
                                "The largest male flamingos have been recorded at up to 187 cm (74 in) tall and 4.5 kg (9.9 lb).\n" +
                                "Like all flamingos, this species lays a single chalky-white egg on a mud mound. Most of the plumage " +
                                "is pinkish-white, but the wing coverts are red and the primary and secondary flight feathers are black." +
                                " The bill is pink with a restricted black tip, and the legs are entirely pink. The call is a " +
                                "goose-like honking. Sub-adult flamingos are whitish-grey and only attain the pink coloration several " +
                                "years into their adult life. The coloration comes from the carotenoid pigments in the organisms that " +
                                "live in their feeding grounds.\n" +
                                "The bird resides in mudflats and shallow coastal lagoons with salt water. Using its feet, the bird stirs up " +
                                "the mud, then sucks water through its bill and filters out small shrimp, seeds, blue-green algae, microscopic " +
                                "organisms and mollusks. The greater flamingo feeds with its head down and its upper jaw is movable and not " +
                                "rigidly fixed to its skull.",
                        getImgResId("lc"),
                        "https://en.wikipedia.org/wiki/Greater_flamingo",
                        "phonicopterus_roseus"),
                new BirdInfo(getImgResId("flamingo_ls"),
                        "Lesser Flamingo",
                        "Phoenicopterus minor",
                        "The lesser flamingo is the smallest species of flamingo, though it is a tall and large bird by most standards. " + "The species can weigh from 1.2 to 2.7 kg (2.6 to 6.0 lb). The standing height is around 80 to 90 cm " + "(31 to 35 in). The total length (from beak to tail) and wingspan are in the same range of " +
                                "measurements, from 90 to 105 cm (35 to 41 in).[4][6] Most of the plumage is pinkish white. The clearest " +
                                "difference between this species and the greater flamingo, the only other Old World species of flamingo, " +
                                "is the much more extensive black on the bill. Size is less helpful unless the species are together, since " +
                                "the sexes of each species also differ in height.\n" +
                                "\n" +
                                "The lesser flamingo may be the most numerous species of flamingo, with a population that (at its peak) " +
                                "probably numbers up to two million individual birds. This species feeds primarily on Spirulina, algae " +
                                "which grow only in very alkaline lakes. Presence of flamingo herds near water bodies is indication of " +
                                "sodic alkaline water which is not suitable for irrigation use. Although blue-green in colour, the algae " +
                                "contain the photosynthetic pigments that give the birds their pink colour. Their deep bill is specialised " +
                                "for filtering tiny food items. The lesser flamingo also feeds on shrimp.",
                        getImgResId("lc"),
                        "https://en.wikipedia.org/wiki/Lesser_flamingo",
                        "phonicopterus_roseus")};
        birds[1] = new BirdInfo[]{
                new BirdInfo(getImgResId("snow_partridge"),
                        "Snow Partridge",
                        "Lerwa lerwa",
                        "The snow partridge (Lerwa lerwa) is a gamebird in the pheasant family Phasianidae found widely distributed across the " +
                                "high-altitude Himalayan regions of India, Pakistan, Nepal and China. It is the only species within its genus. " +
                                "The species is found in alpine pastures and open hillside above the treeline but not in as bare rocky terrain " +
                                "as the Himalayan snowcock and is not as wary as that species. Males and females look similar in plumage but males " +
                                "have a spur on their tarsus." +
                                "This partridge appears grey above and chestnut below with bright red bill and legs and the upper parts finely " +
                                "barred in black and white. In flight the pattern of dark brown primaries and secondaries with a narrow trailing " +
                                "white margin make them somewhat like the much larger Tibetan snowcock. The 14-feathered tail is dark and barred " +
                                "in white. There is variation in the shade and some birds have a nearly black crown. The primaries and " +
                                "secondaries are brown and the breast is deep chestnut. The abdomen has more white and the lower flanks and " +
                                "feathers around the vent are barred brown and white. The under-tail coverts are chestnut with black shaft streaks " +
                                "and white tips. Young birds have the lower parts mottled and the barring less distinct. The tarsus is feathered on " +
                                "the front of the leg half-way to the toes.\n" +
                                "\n" +
                                "It measures 38–40 cm in length. Females weigh 450–580 g; males, 550–700 g. Sexes are similar in plumage, female " +
                                "lacks spurs on the tarsus while the male has a blunt spur and sometimes a second incipient spur. Downy chicks " +
                                "have a resemblance to the chicks of the blood pheasant.[7] Chicks are born with the tarsi feathered and the nostril " +
                                "opening is covered by feathers.",
                        getImgResId("lc"),
                        "https://en.wikipedia.org/wiki/Snow_partridge",
                        "lerwa_lerwa"),
                new BirdInfo(getImgResId("tibetan_snowcock"),
                        "Tibetan Snowcock",
                        "Tetraogallus tibetanus",
                        "The Tibetan snowcock (Tetraogallus tibetanus) is a bird in the pheasant family Phasianidae of the order Galliformes, " +
                                "gallinaceous birds. This species is found in high-altitude regions of the Western Himalayas and the Tibetan " +
                                "Plateau, where it overlaps in part with the larger Himalayan snowcock. The head is greyish and there is a " +
                                "white crescent patch behind the eye and underside is white with black stripes. In flight the secondaries show " +
                                "a broad white trailing edge." +
                                "Smaller than Himalayan snowcock, this species has a grey head and neck with a white patch behind the eye and above the " +
                                "dark cheek. Chin, throat and breast are white, with two grey bands on the breast. Grey wing coverts and tertials " +
                                "have a white trim. The secondaries have a broad white trailing edge that forms a wing band. Underparts are white " +
                                "with black streaks on flanks and belly. The tail is rufous brown and the undertail coverts are black. Legs and " +
                                "beaks are reddish. Sexes are similar, but female has buff in postocular patch, blackish and buff marks on sides " +
                                "of head, neck and breast-band, and lacks the tarsal spurs of the male.",
                        getImgResId("lc"),
                        "https://en.wikipedia.org/wiki/Tibetan_snowcock",
                        "tetraogallus_tibetanus"),
                new BirdInfo(getImgResId("himalayan_snowcock"),
                        "Himalayan Snowcock",
                        "Tetraogallus himalayensis",
                        "The Himalayan snowcock (Tetraogallus himalayensis) is a snowcock in the pheasant family Phasianidae found across the Himalayan " +
                                "ranges and parts of the adjoining Pamir range of Asia. It is found on alpine pastures and on steep rocky cliffs " +
                                "where they will dive down the hill slopes to escape. It overlaps with the slightly smaller Tibetan snowcock " +
                                "in parts of its wide range. The populations from different areas show variations in the colouration and about " +
                                "five subspecies have been designated. They were introduced in the mountains of Nevada in the United States in the " +
                                "1960s and a wild population has established in the Ruby Mountains." +
                                "The Himalayan Snow-Cock is a large grey partridge-like bird, 55–74 cm (22–29 in) in length and weighing 2–3.1 kg " +
                                "(4.4–6.8 lb).[2][3] The head pattern has a resemblance to that of the smaller and well marked chukar partridge. " +
                                "The white throat and sides of the head are bordered by chestnut moustachial stripe and a dark broad chestnut band " +
                                "stretching from the eye over the ear, expanding into the collar. The upper parts are grey, with feathers of the rump " +
                                "and the wings are bordered with rufous. The upper breast is grey with dark crescent bars. The lower breast plumage is " +
                                "dark grey, and the sides of the body are streaked with black, chestnut and white. The undertail coverts are white. The " +
                                "legs and orbital skin are yellow. Sexes are alike in plumage, but the female is smaller and lacks the large tarsal spur " +
                                "of the male. In flight, from above, the white primaries tipped in black and the rufous outer tail feathers make it " +
                                "distinctive. The Tibetan snowcock has a wing pattern with white trailing edge to the secondaries that contrasts with " +
                                "the grey wings.",
                        getImgResId("lc"),
                        "https://en.wikipedia.org/wiki/Himalayan_snowcock",
                        "tetraogallus_himalayensis"),
                new BirdInfo(getImgResId("tibetan_partridge"),
                        "Tibetan Partridge",
                        "Perdix hodgsoniae",
                        "The Tibetan partridge (Perdix hodgsoniae) is a gamebird in the pheasant family Phasianidae of the order Galliformes. " +
                                "They are found widely across the Tibetan Plateau and have some variations in plumage across populations. " +
                                "They forage on the ground in the sparsely vegetated high altitude regions, moving in pairs during the " +
                                "summer and in larger groups during the non-breeding season. Neither males nor females have spurs on their legs." +
                                "Somewhat different in appearance from the other Perdix species such as the grey and Daurian partridges this " +
                                "28–31 cm long partridge has the brown back, blackish belly patch and chestnut flanks of its relatives, " +
                                "but has a striking black and white face pattern, which contrasts with the rufous collar.\n" +
                                "\n" +
                                "The forehead, broad supercilium, face and throat are white. A broad black stripe runs down the face from " +
                                "below the eyes and it has a broad chestnut hind neck collar. The upper parts are buff, barred with rufous " +
                                "and black. The other tail-feathers are chestnut, tipped with white. The lower plumage is pale buff closely " +
                                "barred with black, with broad chestnut bars on the flanks. The male has black belly patch which is barred " +
                                "in female. The female is otherwise similar to the male but duller, and the juvenile is a featureless " +
                                "buff-brown, lacking the distinctive facial and underpart markings of the adult. Sexes are similar in size.",
                        getImgResId("lc"),
                        "https://en.wikipedia.org/wiki/Tibetan_partridge",
                        "perdix_hodgsoniae"),
                new BirdInfo(getImgResId("himalayan_quail"),
                        "Himalayan quail",
                        "Ophrysia superciliosa",
                        "The Himalayan quail (Ophrysia superciliosa) or mountain quail is a medium-sized quail belonging to the pheasant " +
                                "family. It was last reported in 1876 and is feared extinct. This species was known from only 2 locations " +
                                "(and 12 specimens) in the western Himalayas in Uttarakhand, north-west India. The last verifiable record " +
                                "was in 1876 near the hill station of Mussoorie." +
                                "The red bill and legs of this small dark quail and white spots before and after the eye make it distinctive. The " +
                                "male is dark grey with bleak streaks and a white forehead and supercilium. The female is brownish with " +
                                "dark streaks and greyish brow. Like the male it has a white spot in front of the eye and a larger one " +
                                "behind the eye. It is believed to fly only when flushed at close quarters and was found in coveys of " +
                                "five or six. The habitat was steep hillsides covered by long grass.[4] The genus name is derived from " +
                                "Ophrys which refers the brow.\n" +
                                "\n" +
                                "This quail has long tail coverts and the 10 feathered tail is longer, nearly as long as the wing, than in " +
                                "most quails. The feathers of the forehead and bristly and stiff.[7][8]\n" +
                                "\n" +
                                "The species was described in 1846 by J. E. Gray from living specimens in the collection of the Earl of " +
                                "Derby at Knowsley Hall, and he gave the locality as \"India\" with a query.[6] It was not until 1865 " +
                                "that it was first found in the wild by Kenneth Mackinnon who shot a pair in November, in a hollow between " +
                                "Budraj and Benog, behind Mussoorie, at about 6,000 feet (1,800 m) elevation.[6] Two years later, again in " +
                                "November, five specimens were obtained by a group near Jerepani (Jharipani). In December 1876, Major G. " +
                                "Carwithen obtained a specimen from the eastern slopes of Sher-ka-danda, close to Nainital, at an elevation " +
                                "of 7,000 feet (2,100 m). Frank Finn suggested that it was a migratory bird, arriving in winter, although " +
                                "expressing doubts on account of the short wings. The birds near Mussoorie as observed by Hutton and " +
                                "others occurred in small coveys of six to ten, that kept to high grass and scrub, fed on seeds of grass, " +
                                "were difficult to flush, and had a shrill whistling note when flushed. They appeared to arrive about " +
                                "November, but in one case stayed as late as June, after which they disappeared.",
                        getImgResId("cr"),
                        "https://en.wikipedia.org/wiki/Himalayan_quail",
                        "perdix_hodgsoniae"),
                new BirdInfo(getImgResId("manipur_bush_quail"),
                        "Manipur bush quail",
                        "Perdicula manipurensis",
                        "The Manipur bush quail (Perdicula manipurensis) is a species of quail found in India, inhabiting damp grassland, " +
                                "particularly stands of tall grass, in West Bengal, Assam, Nagaland, Manipur, and Meghalaya.[2]\n" +
                                "\n" +
                                "It was first collected and described by Allan Octavian Hume on an ornithological expedition to Manipur in 1881.\n" +
                                "\n" +
                                "P. manipurensis is listed as Endangered on the IUCN's Red List, as its habitat is small, fragmented, and " +
                                "rapidly shrinking.\n" +
                                "\n" +
                                "There was no confirmed sighting of the bird from 1932 until June 2006, when Anwaruddin Choudhury reported " +
                                "spotting the quail in Assam.\n" +
                                "\n" +
                                "BBC News quoted the conservation director of the Wildlife Trust of India, Rahul Kaul, as saying, \"This " +
                                "creature has almost literally returned from the dead.\"",
                        getImgResId("en"),
                        "https://en.wikipedia.org/wiki/Manipur_bush_quail",
                        "perdix_hodgsoniae"),
                new BirdInfo(getImgResId("western_tragopan"),
                        "Western tragopan",
                        "Tragopan melanocephalus",
                        "The western tragopan or western horned tragopan (Tragopan melanocephalus) is a medium-sized brightly plumed pheasant " +
                                "found along the Himalayas from north-eastern districts of Khyber Pakhtunkhwa province in northern Pakistan " +
                                "in the west to Uttarakhand within India to the east. The species is highly endangered and globally threatened." +
                                "The male is very dark, grey and black with numerous white spots, each spot bordered with black and deep crimson " +
                                "patches on the sides and back of the neck. The throat is bare with blue skin while the bare facial skin " +
                                "is red. They have a small black occipital crest. Females have pale brownish-grey upper parts finely " +
                                "vermiculated and spotted with black, and most of the feathers have black patches and central white " +
                                "streaks. Immature males resemble females, but are larger with longer legs and a variable amount of " +
                                "black on the head and red on neck.\n" +
                                "\n" +
                                "Males weigh 1.8–2.2 kg (4.0–4.9 lb) and females weigh 1.25–1.4 kg (2.8–3.1 lb). The males vary in length " +
                                "from 55–60 cm (22–24 in) while the females are 48–50 cm (19–20 in).",
                        getImgResId("vu"),
                        "https://en.wikipedia.org/wiki/Western_tragopan",
                        "tragopan_melanocephalus"),
                new BirdInfo(getImgResId("himalayan_monal"),
                        "Himalayan Monal",
                        "Lophophorus impejanus",
                        "The Himalayan monal (Lophophorus impejanus), also known as the Impeyan monal, Impeyan pheasant, is a bird in the " +
                                "pheasant family, Phasianidae. It is the national bird of Nepal, where it is known as Danphe, and state " +
                                "bird of Uttarakhand India, where it is known as Monal. It was also the state bird of Himachal Pradesh, " +
                                "until 2007.\n" +
                                "\n" +
                                "Traditionally, the Himalayan monal has been classified as monophyletic. However, studies have shown that " +
                                "the male Himalayan monal of northwestern India lacks the white rump of other Himalayan monals, and it has " +
                                "more green on the breast, indicating the possibility of a second subspecies." +
                                "It is a relatively large-sized pheasant. The bird is about 70 centimeters long. The male weighs up to 2380 " +
                                "grams and the female 2150. The adult male has multicoloured plumage throughout, while the female, as in " +
                                "other pheasants, is dull in colour. Notable features in the male include a long, metallic green crest, " +
                                "coppery feathers on the back and neck, and a prominent white rump that is most visible when the bird " +
                                "is in flight. The tail feathers of the male are uniformly rufous, becoming darker towards the tips, " +
                                "whereas the lower tail coverts of females are white, barred with black and red. The female has a " +
                                "prominent white patch on the throat and a white strip on the tail. The first-year male and the juvenile " +
                                "resemble the female, but the first-year male is larger and the juvenile is less distinctly marked.",
                        getImgResId("lc"),
                        "https://en.wikipedia.org/wiki/Himalayan_monal",
                        "lophophorus_impejanus")

        };
        birds[2] = new BirdInfo[]{new BirdInfo(getImgResId("eastern_great_egret"),
                "Eastern great Egret",
                "Ardea alba modesta",
                "The eastern great egret (Ardea alba modesta), a white heron in the genus Ardea, is a subspecies of the " +
                        "great egret (A. alba). It was first described by British ornithologist John Edward Gray in 1831." +
                        "Measuring 83–103 cm (33–41 in) in length and weighing 0.7–1.2 kg (1.5–2.6 lb), the eastern great egret " +
                        "is a large heron with all-white plumage. Its bill is black in the breeding season and yellow " +
                        "at other times, and its long legs are red or black.[citation needed] The colours of the " +
                        "bare parts of the face change to green during the breeding season. The breeding plumage " +
                        "is also marked by long neck plumes and a green facial area. The eastern great egret can " +
                        "be distinguished from other white egrets and herons in Asia and Australia by its very long " +
                        "neck, one and a half times as long as its own body.",
                getImgResId("lc"),
                "https://en.wikipedia.org/wiki/Eastern_great_egret",
                "ardea_alba_modesta"),
                new BirdInfo(getImgResId("western_reef_heron"),
                        "Western reef Heron",
                        "Egretta gularis",
                        "The western reef heron (Egretta gularis) also called the western reef egret, is a medium-sized " +
                                "heron found in southern Europe, Africa and parts of Asia. It has a mainly coastal " +
                                "distribution and occurs in two plumage forms, a slaty-grey plumage in which it can " +
                                "only be confused with the rather uncommon dark morph of the little egret (Egretta garzetta) " +
                                "and a white form which can look very similar to the little egret although the bill tends to " +
                                "be paler and larger. There are also differences in size, structure and foraging behaviour. " +
                                "There have been suggestions that the species hybridizes with the little egret, and based on" +
                                " this, some authors treat schistacea and gularis as subspecies of Egretta garzetta. Works " +
                                "that consider the western reef heron as a valid species include the nominate gularis and " +
                                "schistacea as subspecies." +
                                "This bird has two plumage colour forms. There is an all-white morph and a dark grey morph;" +
                                " morphs can also occur with intermediate shades of grey which may be related to age[2] " +
                                "or particoloured in grey and white. The white morph is similar in general appearance " +
                                "to the little egret, but has a larger yellower bill, extended yellow on thicker legs, " +
                                "and when foraging tends to be very active, sometimes also moving its wing or using it " +
                                "to shade the water surface. The grey morph has a whitish throat and is unlikely to be " +
                                "confused with any other species within the range of this egret with beak and legs similar " +
                                "to that of the white morph. During the breeding season the legs and facial skin are " +
                                "reddish.[3] Breeding birds have two long feathers on the sides of the nape. The " +
                                "nominate subspecies gularis has a range from West Africa to Gabon, with some birds " +
                                "breeding in southern Europe. Subspecies schistacea (Hemprich & Ehrenberg, 1828) breeds " +
                                "from the Persian Gulf along the coast of India to the east of the India Peninsula. The " +
                                "form on the eastern coast of South Africa is usually separated as the dimorphic egret " +
                                "Egretta dimorpha. The dark and white morph is thought to be controlled by a " +
                                "single allele with the dark character being incompletely dominant over the gene for " +
                                "white.",
                        getImgResId("lc"),
                        "https://en.wikipedia.org/wiki/Western_reef_heron",
                        "egretta_gularis")};
        birds[3] = new BirdInfo[]{new BirdInfo(getImgResId("brahminy_kite"),
                "Brahminy Kite",
                "Haliastur indus",
                "The brahminy kite (Haliastur indus), also known as the red-backed sea-eagle in Australia, is a " +
                        "medium-sized bird of prey in the family Accipitridae, which also includes many other diurnal " +
                        "raptors, such as eagles, buzzards, and harriers. They are found in the Indian subcontinent, " +
                        "Southeast Asia, and Australia. They are found mainly on the coast and in inland wetlands where " +
                        "they feed on dead fish and other prey. Adults have a reddish brown plumage and a contrasting " +
                        "white head and breast which makes them easy to distinguish from other birds of prey." +
                        "The brahminy kite is distinctive and contrastingly coloured, with chestnut plumage except for the " +
                        "white head and breast and black wing tips. The juveniles are browner, but can be distinguished " +
                        "from both the resident and migratory races of black kites in Asia by the paler appearance, " +
                        "shorter wings, and rounded tail. The pale patch on the underwing carpal region is of a squarish " +
                        "shape and separated from Buteo buzzards.\n" +
                        "\n" +
                        "The brahminy kite is about the same size as the black kite (Milvus migrans) and has a typical " +
                        "kite flight, with wings angled, but its tail is rounded unlike the Milvus species, red kite, " +
                        "and black kite, which have forked tails.[2] The two genera are however very close.\n" +
                        "\n" +
                        "The call is a mewing keeyew.",
                getImgResId("lc"),
                "https://en.wikipedia.org/wiki/Brahminy_kite",
                "haliastur_indus"),
                new BirdInfo(getImgResId("andaman_serpent_eagle"),
                        "Andaman serpent Eagle",
                        "Spilornis elgini",
                        "The Andaman serpent eagle (Spilornis elgini) is a species of bird of prey in the Accipitridae " +
                                "family. It is endemic to Andaman Islands in India\n" +
                                "\n" +
                                "Its natural habitats are subtropical or tropical moist lowland forests and subtropical" +
                                " or tropical mangrove forests. It is threatened by habitat loss.",
                        getImgResId("nt"),
                        "https://en.wikipedia.org/wiki/Andaman_serpent_eagle",
                        "spilornis_elgini"),
        };
        birds[4] = new BirdInfo[]{new BirdInfo(getImgResId("rose_ringed_parakeet"),
                "Rose-ringed Parakeet",
                "Psittacula krameri",
                "The rose-ringed parakeet (Psittacula krameri), also known as the ring-necked parakeet, is a gregarious" +
                        " tropical Afro-Asian parakeet species that has an extremely large range.\n" +
                        "\n" +
                        "The rose-ringed parakeet is sexually dimorphic. The adult male sports a red or black neck " +
                        "ring and the hen and immature birds of both sexes either show no neck rings, or display " +
                        "shadow-like pale to dark grey neck rings. Both sexes have a distinctive green colour. " +
                        "Rose-ringed parakeets measure on average 40 cm (16 in) in length, including the tail " +
                        "feathers, a large portion of their total length. Their average single-wing length is about " +
                        "15–17.5 cm (5.9–6.9 in). In the wild, this is a noisy species with an unmistakable " +
                        "squawking call. It is herbivorous and not migratory.\n" +
                        "\n" +
                        "One of the few parrot species that have successfully adapted to living in disturbed " +
                        "habitats, it has withstood the onslaught of urbanisation and deforestation. As a popular " +
                        "pet species, escaped birds have colonised a number of cities around the world. Since " +
                        "the population appears to be increasing, the species was evaluated as being of least " +
                        "concern by the IUCN in 2012, but its popularity as a pet and unpopularity with farmers " +
                        "have both reduced its numbers in some parts of its native range.",
                getImgResId("lc"),
                "https://en.wikipedia.org/wiki/Rose-ringed_parakeet",
                "psittacula_krameri"),
                new BirdInfo(getImgResId("blossom_headed_parakeet"),
                        "Blossom-headed Parakeet",
                        "Psittacula roseata",
                        "The blossom-headed parakeet (Psittacula roseata) is a parrot which is a resident breeder in northeast India eastwards into Southeast Asia. It undergoes local movements, driven mainly by the availability of the fruit and blossoms which make up its diet.\n" +
                                "\n" +
                                "BlossomHeadedParakeetGould.jpg\n" +
                                "It has two subspecies,nominate and juneae Blossom-headed parakeet is a bird of " +
                                "forest and open woodland. It nests in holes in trees, laying 4-5 white eggs.\n" +
                                "\n" +
                                "The female has a pale grey head and lacks the black neck collar and chin stripe " +
                                "patch. The lower mandible is pale. Immature birds have a green head and a grey " +
                                "chin. Both mandibles are yellowish and there is no red shoulder patch.\n" +
                                "\n" +
                                "The different head colour and the yellow tip to the tail distinguish this species " +
                                "from the similar plum-headed parakeet (Psittacula cyanocephala).\n" +
                                "\n" +
                                "Blossom-headed parakeet is a gregarious and noisy species with range of raucous calls.",
                        getImgResId("nt"),
                        "https://en.wikipedia.org/wiki/Blossom-headed_parakeet",
                        "psittacula_roseata")};
        birds[5] = new BirdInfo[]{new BirdInfo(getImgResId("indian_scops_owl"),
                "Indian scops Owl",
                "Otus bakkamoena",
                "The Indian scops owl (Otus bakkamoena) is a resident species of owl found in the southern regions " +
                        "of Asia from eastern Arabia through the Indian Subcontinent, except the far north, east " +
                        "across much of Southeast Asia to Indonesia. This species formerly included what has been " +
                        "split out as the collared scops owl (Otus lettia). The species epithet is derived from \"bakamuna\", the Sinhalese name for the white barn owl (Tyto alba), and the brown fish owl (Ketupa zeylonensis).[2]\n" +
                        "\n" +
                        "The Indian scops owl is a common resident bird in forests and other well-wooded areas. It " +
                        "nests in a hole in a tree, laying 3–5 eggs.\n" +
                        "\n" +
                        "The Indian scops owl is a small (23–25 cm) owl, although it is one of the largest of the " +
                        "scops owls. Like other scops owls, it has small head tufts, or ears. The upperparts are grey " +
                        "or brown, depending on the morph, with faint buff spotting. The underparts are buff with fine " +
                        "darker streaking.\n" +
                        "\n" +
                        "The facial disc is whitish or buff, and the eyes are orange or brown. There is a buff neckband. " +
                        "Sexes are similar. The flight is deeply undulating.\n" +
                        "\n" +
                        "This species is nocturnal. Through its natural camouflage, it is very difficult to see in " +
                        "daytime. But it can often be located by the small birds that mob it while it is roosting in " +
                        "a tree. It feeds mainly on insects. The call is a soft single note (\"whuk?\").\n" +
                        "\n" +
                        "This species is very similar to the slightly larger partially migratory collared scops owl " +
                        "Otus lettia and the oriental scops owl Otus sunia. They can be separated on call and eye colour.",
                getImgResId("lc"),
                "https://en.wikipedia.org/wiki/Indian_scops_owl",
                "otus_bakkamoena"),
                new BirdInfo(getImgResId("indian_eagle_owl"),
                        "Indian eagle Owl",
                        "Bubo bengalensis",
                        "The Indian eagle-owl, also called the rock eagle-owl or Bengal eagle-owl (Bubo bengalensis), " +
                                "is a species of large horned owl found in the Indian Subcontinent. They were earlier " +
                                "treated as a subspecies of the Eurasian eagle-owl. They are found in hilly and rocky " +
                                "scrub forests, and are usually seen in pairs. They have a deep resonant booming call " +
                                "that may be heard at dawn and dusk. They are typically large owls, and have \"tufts\" " +
                                "on their heads. They are splashed with brown and grey, and have a white throat patch " +
                                "with black small stripes.",
                        getImgResId("lc"),
                        "https://en.wikipedia.org/wiki/Indian_eagle-owl",
                        "bubo_bengalensis")};
        birds[6] = new BirdInfo[]{new BirdInfo(getImgResId("common_kingfisher"),
                "Common Kingfisher",
                "Alcedo atthis",
                "The common kingfisher (Alcedo atthis) also known as the Eurasian kingfisher, and river kingfisher, is " +
                        "a small kingfisher with seven subspecies recognized within its wide distribution across " +
                        "Eurasia and North Africa. It is resident in much of its range, but migrates from areas " +
                        "where rivers freeze in winter.\n" +
                        "\n" +
                        "This sparrow-sized bird has the typical short-tailed, large-headed kingfisher profile; it " +
                        "has blue upperparts, orange underparts and a long bill. It feeds mainly on fish, caught by " +
                        "diving, and has special visual adaptations to enable it to see prey under water. The glossy " +
                        "white eggs are laid in a nest at the end of a burrow in a riverbank.",
                getImgResId("lc"),
                "https://en.wikipedia.org/wiki/Common_kingfisher",
                "alcedo_atthis"),
                new BirdInfo(getImgResId("oriental_dwarf_kingfisher"),
                        "Oriental dwarf Kingfisher",
                        "Ceyx erithaca",
                        "The Oriental dwarf kingfisher (Ceyx erithaca), also known as the black-backed kingfisher or three-toed " +
                                "kingfisher, is a species of bird in the family Alcedinidae.[3]\n" +
                                "\n" +
                                "This is a small, red and yellow kingfisher, averaging 13 cm (5.1 in) in length, yellow " +
                                "underparts with glowing bluish-black upperparts. A widespread resident of lowland forest, " +
                                "it is endemic across much of the Indian subcontinent and Southeast Asia. It is found in " +
                                "Bangladesh, Bhutan, Brunei, Cambodia, India, Indonesia, Laos, Malaysia, Myanmar, Singapore, " +
                                "Sri Lanka, and Thailand.\n" +
                                "\n" +
                                "The preferred habitat is small streams in densely shaded forests.[4] In the Konkan region " +
                                "of southwest India, it begins to breed with the onset of the southwest monsoon in June. " +
                                "The nest is a horizontal tunnel up to a metre in length. The clutch of four or five eggs " +
                                "hatches in 17 days with both the male and female incubating. The birds fledge after 20 days " +
                                "and a second brood may be raised if the first fails. The young are fed with geckos, skinks, " +
                                "crabs, snails, frogs, crickets, and dragonflies.[5] The rufous-backed kingfisher is " +
                                "sometimes considered a subspecies.",
                        getImgResId("lc"),
                        "https://en.wikipedia.org/wiki/Oriental_dwarf_kingfisher",
                        "ceyx_erithaca")};
    }
}
