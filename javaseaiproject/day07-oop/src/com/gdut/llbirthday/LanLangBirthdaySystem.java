package com.gdut.llbirthday;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;


/**
 * 兰浪专属生日管理系统
 * 基于其个人特色定制开发
 */
public class LanLangBirthdaySystem {

    /**
     * 兰浪个人信息配置类
     */
    static class LanLangProfile {
        private static final String NAME = "兰浪";
        private static final LocalDate BIRTHDAY = LocalDate.of(2006, 11, 14); // 假设出生年份
        private static final List<String> HOBBIES = Arrays.asList(
            "篮球", "桌球", "王者荣耀", "金铲铲之战"
        );
        private static final List<String> CATCHPHRASES = Arrays.asList(
            "加饭，没味道，都不好吃",
            "好呐好呐",
            "你nb 你伟大呐",
            "莫愁前路无知己，冲鸭",
            "oi~ 正串月"
        );

        public static int getAge() {
            return Period.between(BIRTHDAY, LocalDate.now()).getYears();
        }
    }

    /**
     * 游戏技能等级管理器
     */
    static class GameSkillManager {
        private Map<String, Integer> skillLevels;

        public GameSkillManager() {
            this.skillLevels = new HashMap<>();
            initializeSkills();
        }

        private void initializeSkills() {
            skillLevels.put("篮球", 98);
            skillLevels.put("桌球",60);
            skillLevels.put("王者荣耀", 92);
            skillLevels.put("金铲铲之战", 88);
        }

        public void levelUp(String game) {
            skillLevels.merge(game, 5, Integer::sum);
        }

        public void displaySkills() {
            System.out.println("\n🎮 兰浪游戏技能面板:");
            skillLevels.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry ->
                    System.out.printf("- %s: %d级 %s%n",
                        entry.getKey(),
                        entry.getValue(),
                        getLevelDescription(entry.getValue())
                    )
                );
        }

        private String getLevelDescription(int level) {
            if (level >= 90) return "🏆 宗师级";
            if (level >= 80) return "⭐ 高手级";
            if (level >= 70) return "🔥 进阶中";
            return "💪 新秀级";
        }
    }

    /**
     * 兰浪语录生成器
     */
    static class CatchphraseGenerator {
        private static final List<String> CATCHPHRASES = LanLangProfile.CATCHPHRASES;
        private Random random = new Random();

        public String getRandomCatchphrase() {
            return CATCHPHRASES.get(random.nextInt(CATCHPHRASES.size()));
        }

        public void generateSpecialBirthdayPhrase() {
            String[] birthdayTemplates = {
                "%s 生日快乐！今天必须%s！",
                "今天是%s的生日，%s就是最好的祝福！",
                "%s + %s = 完美的生日！",
                "今天生日必须%s",
                "以后的日子一定要多%s"
            };
            for (int i = 0; i < 8; i++) {
            String template = birthdayTemplates[random.nextInt(birthdayTemplates.length)];
            switch (template.split("%s").length - 1) {
                case 2:
                    System.out.printf(template,
                        LanLangProfile.NAME,
                        getRandomCatchphrase()
                    );
                    break;
                case 3:
                    System.out.printf(template,
                        LanLangProfile.NAME,
                        getRandomCatchphrase(),
                        getRandomCatchphrase()
                    );
                    break;
                default:
                    // 处理其他情况，确保有输出
                    System.out.printf("兰浪以后一定要作阳光开朗大男孩",
                            LanLangProfile.NAME,
                            getRandomCatchphrase());
                    break;
            }

            System.out.println();
            }
        }
    }

    /**
     * 生日倒计时计算器
     */
    static class BirthdayCountdown {
        public static long getDaysUntilNextBirthday() {
            LocalDate today = LocalDate.now();
            LocalDate nextBirthday = LanLangProfile.BIRTHDAY.withYear(today.getYear());

            if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
                nextBirthday = nextBirthday.plusYears(1);
            }

            return Period.between(today, nextBirthday).getDays();
        }

        public static boolean isBirthdayToday() {
            LocalDate today = LocalDate.now();
            return today.getMonthValue() == 11 && today.getDayOfMonth() == 14;
        }
    }

    /**
     * 主程序入口
     */
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("🚀 兰水良生日祝福系统 ");
        System.out.println("===========================================");

        // 检查是否生日当天
        if (BirthdayCountdown.isBirthdayToday()) {
            celebrateBirthday();
            showCountdown();
        }
    }

    /**
     * 生日庆祝模式
     */
    private static void celebrateBirthday() {
        GameSkillManager skillManager = new GameSkillManager();
        CatchphraseGenerator phraseGenerator = new CatchphraseGenerator();

        System.out.printf("\n🎉 恭贺兰浪%d岁生日快乐！ 🎂\n", LanLangProfile.getAge());

        // 显示技能面板
        skillManager.displaySkills();

        // 特殊语录生成
        System.out.println("\n💬 生日专属语录:");
        phraseGenerator.generateSpecialBirthdayPhrase();

        // 生日祝福
        generatePersonalizedWishes(skillManager);
    }

    /**
     * 生成个性化祝福
     */
    private static void generatePersonalizedWishes(GameSkillManager skillManager) {
        System.out.println("亲爱的兰浪，");
        System.out.println("- 愿你的篮球技术越来越浪险！");
        System.out.println("- 愿你在王者峡谷中carry全场，没事多回来陪我干农活！");
        System.out.println("- 愿你的金铲铲阵容永远无敌，别上头了孩子！");
        System.out.println("- 愿你的口头禅成为传奇！");
        System.out.println("- 愿你的每一天都充满欢乐！");
        System.out.println("\n🌟 Happy Birthday! Enjoy your special day! 🌟");
    }

    /**
     * 倒计时显示模式
     */
    private static void showCountdown() {
        long daysLeft = BirthdayCountdown.getDaysUntilNextBirthday();
        System.out.printf("\n⏰ 距离兰浪下一个生日还有 %d 天\n", daysLeft);
        System.out.println("今年还比较菜，明年给你做个更逆天的！");
    }
}

