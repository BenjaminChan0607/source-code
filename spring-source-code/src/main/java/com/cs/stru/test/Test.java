package com.cs.stru.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author benjaminChan
 * @date 2018/9/20 0020 下午 3:05
 */
public class Test implements BeanFactoryAware {

    private BeanFactory beanFactory;

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void testAware() {
        Hello hello = (Hello) beanFactory.getBean("hello");
        hello.sayHello();
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Test test = (Test) applicationContext.getBean("test");
        test.testAware();
    }

    public void test() {
        /**
         *
         * 玲子笑一笑，用打火机点火。“你的年纪不大，很懂得如何讨女人喜欢哪。”
         我有点脸红。“我只是坦白说出自己心中所想的话而已。”
         “我知道。”玲子笑看说。不久饭煮好了，我在锅里抹油，开始准备下锅。
         “这不是梦吧？”玲于抽着鼻闻味道。
         “根据我的经验。这是百分百现实的火锅。”我说。我们没有再谈什么，只是默默地吃火锅、喝啤酒、然后吃饭。“海雕”闻到香味跑来，我把肉分给他。吃饱以后，我们靠在套廊的柱子上看月亮。
         “这样子心满意足了吧！”我问。
         “没得挑剔了。”玲子仿佛很辛苦似地说。“我第一次吃那么多。”
         “待会打算怎样？”
         “休息一下，我想去澡堂。头发乱七八糟的，我想洗一洗。”
         “好的。澡堂就在附近。”我说。
         “对了，渡边，若是方便，请告诉我，你和那位阿绿小姐已经睡过了吗？”玲子
         “你是说有没有做爱？没有。在许多事情没弄清楚以前，我们决定不做。”
         “现在不是都弄清楚了吗：”
         我摇摇头表示不懂。“你的意思是直子死了，一切尘埃落定？”
         “不是这个意思。你不是在直子死去之前就作出决定，不会跟阿绿分开了么？这件事跟直子是活是死都无关，对不？你拣选阿绿。直于拣选了死。你已经是大人了，必须对自己所选择的负起责任。否则不是一塌糊涂吗？”
         “但我忘不了她。”我说。“我对直子说过，我会永远等她。可是我没有。结果来说，我还是放开她了。这不是谁对谁错的问题．而是我本身的问题。也许我纵然半路不放开她，|Qī-shu-ωang|结果还是一样，直于毕竟还是拣选死亡。但我觉得我就是不能原谅自己。虽然你认马那是一种自然的心灵活动，无可奈何，然而我和直子的关系并不如此单纯。想起来，我们从一开始就是在生死的交界线上互相结合在一起的。”
         “若是件对直子有某种哀痛的感觉的话，你就带看那种哀痛度过往后的人生好了。若是从中能够学到什么，你就学吧。不过，那是另一回事，你应该和阿绿共创幸福。你的哀痛和阿绿是扯不上关系的。若是你再伤害它的话，将会做成无法挽回的局面。虽然痛苦，你还是要坚强起来，你要长大成熟。我是为了向你说这句话，特意离开阿美宿舍，长途跋涉地搭那种棺材以的火车老远跑来这里的。”
         “我很了解你所说的。”我说。“但我还没作好准备。你不觉得吗？那个丧礼实在太寂寞了。人不应该那样子死去的。”
         玲子伸手摸摸我的头。“总有一天，我们每个人都会那样子死去的，包括你和我。”
         我们沿看河边走五分钟到澡堂。洗完后带看爽朗的心情回到家。然后拔掉酒瓶盖，坐在套廊喝。
         “渡边，再拿一个玻璃杯来好吗？”
         “好哇。你想做什么？”
         “我们来为直子办丧礼。”玲子说。“一个不寂寞的丧礼。”
         我把玻璃杯拿来后，玲子在杯里斟满葡萄酒，摆在院子的石灯笼上。然后坐在套廊，抱看吉他靠在柱子抽烟。
         “如果有火柴的话，拿给我好吗？愈多愈好。”
         我从厨房拿了一大包火柴过来，在她旁边坐下。
         “我弹一首，你就在那里排一根火柴，好不好？从现在起，我把我会弹的都弹出来。”
         她先弹了亨利曼西尼的“亲爱的心”，弹得优美而祥和。“这张唱片是件送给直子的吧”．”
         “是的。前年的圣诞节。因为她很喜欢这首曲子。”
         “我也喜欢。非常优美。”她又弹了几段“亲爱的心”的旋律，辍一口酒。“在我喝醉之前，不知能弹几首？哎。这样的丧礼应该不会寂寞了吧！”
         玲子改弹披头四的“挪威的森休”、“昨天”、“米雪兜”、“某事”、“太阳出来了”、“山上的傻叭”。我排了七根火柴。
         “七首了。”玲子说看，喝一口酒，喷一口烟。“这些人的确很了解人生的悲哀和优雅。”
         她口中的“那些人”，当然是指约翰连侬、保罗麦卡尼以及乔治哈里森了。
         她叹一口气，揉熄香烟，又拿起吉他来弹“小巷”、“黑马”、“朱莉亚”、“当我六十四岁时”、“人在何处”、“我爱她”和“喃，朱蒂”。
         “现在几首了？”
         “十四首。”我说。
         “唔。”她叹息。“你也可以弹一首什么吧！”
         “我弹不好。”
         “不好也没关系嘛。”
         我把自己的吉他拿来，战战兢兢地弹了一首“屋顶上”。玲子趁那时稍微休息，抽抽烟喝喝酒。我弹完后，她鼓掌。
         然后，玲子弹了改编为吉他由约拉维尔的“献给公主的安魂曲”和德比西的“月光”，弹得细腻而优美。
         “这两首曲子是直子死去以后才弹得好的。”玲子说。“她喜欢音乐的地步，直到最后都脱离不了伤感的境地。”
         按着她演奏了几首巴卡拉殊的曲子：“靠近你”、“雨不断滴在我头上”、“圭在你身边”和“结婚钟声的怨曲”。
         三十首了。”我说。
         “我好像是自动点唱机”玲子开心地说。“音乐大学的老师看到这种场面，大概吓昏了。”
         她喝看葡萄酒，一边抽烟，一边一首接一首地弹。弹了十首巴萨洛华，包括罗杰．哈特及高素恩的曲子。以及鲍伙伦、雷查尔斯、凯勒克、海边男孩、史提威汪达等人的音乐。“蓝色天鹅绒”、“青青草原”，所有一切的曲子都弹了。偶尔闭起眼睛轻轻摇头，配合旋律哼歌。
         葡萄酒喝完了，我们改喝威士忌。我把院子哀的葡萄酒侥在石灯笼上，另外斟满一杯威士忌。
         “现在几首了？”
         “四十八首。”我说。
         第四十九首，玲子弹了“伊莉娜”，第五十首又是“挪威的森林”。弹完五十首后，她停下来，喝了一口威士忌。
         “弹了这么多，应该够了。”
         “够了。”我说。“了不起。”
         “懂吗？渡边，把寂寞丧礼的事忘得一干二净吧！．”玲子盯看我的眼睛说。“只要记住这个丧礼就可以了。是不是很美妙？”
         我点点头。
         “赠品。”玲子说。第五十首是她最爱弹的巴哈的赋格曲。
         “渡边，跟我做那个吧：”弹完后，玲子小小声说。
         “不可思议。”我说。“我也在想同样的事。”
         在拉上窗帘的黑暗房间里，我和玲子极其理所当然似地相拥，互相需要对方的身体。我帮她脱下衬衫、长裤和内裤。
         “我度过一段相当曲折的人生，做梦地想不到会议一个小我十九岁的男孩脱内裤。”玲子说。
         “要不要自己来？”我说。
         “没关系，你来好了。”她说。“我满身是皱纹，你别失望才好。”
         “我喜欢你的皱纹。”
         “我会哭的。”玲子轻声说。
         我吻遍她的全身，用舌头甜她的皱纹。我的手按在她那宛如少女的小乳房上，温柔地咬它的乳头，手指伸进她那温湿的阴道缓缓抚动。
         “渡边，不是那边。”玲子在我耳畔说。“那只是皱纹。”
         “怎么这个时候还会开玩笑？”我无奈说道。
         “抱歉。”玲子说。“我害怕，因我太久没做了。感觉上像一个十七岁少女跑去男生的宿舍玩，却被脱光衣服似的。”
         “我的感觉真的像在侵犯一个十七岁少女似的。”
         我的手指仲进她的皱纹中，亲吻她的脖子和耳垂。她的呼吸急促起来，喉咙开始颤抖时，我把她的腿打开。慢慢进入里面。
         “没问题吧，你不会使我怀孕吧。”玲子轻声问我。“这把年纪怀孕很羞家的。”
         “没事的。放心好了。”我说。
         我进到深处，她颤抖看叹息。我温柔地抚摸她的背，用力抽动几次，突然无预兆地射精了。我无法控制自己，只能紧紧抱住她。
         “对不起。我忍不住。”我说。
         “傻瓜，何必这样想嘛。”玲子拍拍我的屁股。“你跟女孩子做爱时都在想这种事：”
         “也许吧。”
         “跟我做的时候，不必想这个。忘了它。你爱几时就几时。怎样？舒服吗？”
         “太舒服了，所以忍不住。”
         “何必忍呢？这就好。我也觉得得棒。”
         “玲子。”我说。
         “什么？”
         “你应该再和人谈恋爱.这样子太可惜了。”
         “我会考虑的。”玲子说。“不过，旭川的人会谈恋爱吗？”
         过了一会，我又勃起。玲子屏住呼吸扭动身体。我们边做边聊天。在她里面这样子聊天的感觉很美妙。我一讲笑话她就吃吃她笑，笑的震动传到我那儿。我们这样做了好久。
         “这样的感觉美极了。”玲子说。
         “动一动也不坏。”我说
         “试试看。”
         我把她的腰抱起来，进入更深处，尽情品尝销魂的滋味。当晚我们亲热了四次.完事后玲子在我腕臂中闭起眼睛深叹，身体不住地侈
         “我以后不必再做爱了。”玲子说。“我把人生的全部都做完了，可以安心做其他事了。”
         “谁知道明天如何？”我说。
         我建议玲子搭飞机去，又快又舒适，但她坚持要搭火车。
         “我喜欢青函联络船，不想坐飞机。”她说。于是我送她到上好车站。她提看吉他箱子，我抬着旅行箱，我们并肩坐在月台的长椅上等火车。她跟来东京那一天一样，穿看斜纹呢夹克和白长裤。
         “旭川真的不错？”玲子间。
         “很好的城市。”我说。“过些时候，我会去看你。”
         “真的？”
         我点点头。“我写信给你。”
         “我喜欢你的信。可是直子全都烧掉了。那么好的信。”
         “信只是普通的纸。”我说。“纵使烧了，留在心中的东西依然会留下，不能留下的留看也没用。”
         “老实说，我好怕。一个人孤苦零丁的去旭川，好可怕呀。所以，记得写信给我。看了你的信，我会觉得你就在我身边。”
         “你喜欢的话，我就天天写给你。没问题的。无论走到天涯海角，石田玲子都能活得很好。”
         “我总觉得自己体内好像还有什么东西堵住似的，难道是错觉？”
         “那是残存的记忆。”我说看笑起来。玲子也笑了。
         “不要忘了我。”她说。
         “永远不忘记你。”我说。
         “也许以后没机会再见到你了，不过，无论丢到那里，我都会永远记得你和直子。”
         我看看她的眼睛，她哭了。我禁不住吻了她。虽然周围经过的人频频盯看我们看，但我已经不在意了。我们活看，只须考虑怎样活下去就够了。
         “祝你幸福。”分手之际，玲子对我说。“我能向你忠告的全都说完了，再也没什么好说的，只能祝你幸福。让我和直子那一份的幸福都给予你。”
         我们握手告别。
         我打电话给阿绿，说无论如何都要跟她谈一谈。我说我有很多话要说，必须对她说。在这个世界上，除她以外别无所求。我想见她，一切的一切从头开始来过。
         阿绿在电话的另一端，沉默了好久。仿佛全世界的细雨下在全世界的青草地上似的，沉默无声。那段时间，我闭起眼睛，额头一直压在玻璃窗上，终于阿绿开口了。她用平静的声音说：“现在你在哪里？”
         我现在在哪里？
         我继续握住听筒台起脸来，看看电话亭的四周。如今我在什么地方？我不知道那是什么地方。我猜不看。到底这里是那里？映入我眼帘的只是不知何处去的人蔓，行色匆匆地从我身边走过去。而我只能站在那个不知名的地方，不停地呼唤阿绿的名字。
         后记
         原则上，我不喜欢替小说写后记，不过我想这部小说有写一写的必要。
         首先，这部小说是以我在五年前写过的短篇“萤火虫”为底本的。木来我打算把它扩写成中篇，不料一写就欲罢不能，写成了长篇。也许是小说本身的要求超出我所想像的缘故。
         第二，这是一部极其私人的小说。就如有些人喜欢我，有些人不喜欢我一样，有些人富喜欢这部小说，有些人不会喜欢。但我希望，这部小说罢凌驾我个人而流传下去。
         第三，这部小说是在南欧写的。一九八六年十二月一一十一日，我在希腊的未可诺斯岛开始动笔，一九八七年二一月二十七日在罗马郊外的公寓酒店完成。我几乎天天泡在吵闹的小节馆里，戴看耳机重复听看“佩珀上士”的录音带，一边听一边写。在某种意义上，这部小说可说得到连侬和保罗．麦卡尼的些许帮助。
         第四，我把这部小说献给我死去的朋友以及活着的朋友们。
         一九八七年六月
         　村上春树
         炽天使书店七至十一章
         更多精彩好书，更多原创手机电子书，请登陆奇书网--Www.Qisuu.Com
         */
    }
}
