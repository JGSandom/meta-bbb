PIN | USE | ZCZ BALL | OFFSET | NAME | MODE 0 | MODE 1 | MODE 2 | MODE 3 | MODE 4 | MODE 5 | MODE 6 | MODE 7
:---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---:
1 | gnd |  |  | GND |  |  |  |  |  |  |  | 
2 | gnd |  |  | GND |  |  |  |  |  |  |  | 
3 | emmc | R9 | 0x18 | GPMC_AD6 | gpmc_ad6 | mmc1_dat6 |  |  |  |  |  | gpio1[6]
4 | emmc | T9 | 0x1c | GPMC_AD7 | gpmc_ad7 | mmc1_dat7 |  |  |  |  |  | gpio1[7]
5 | emmc | R8 | 0x08 | GPMC_AD2 | gpmc_ad2 | mmc1_dat2 |  |  |  |  |  | gpio1[2]
6 | emmc | T8 | 0x0c | GPMC_AD3 | gpmc_ad3 | mmc1_dat3 |  |  |  |  |  | gpio1[3]
7 |  | R7 | 0x90 | GPMC_ADVn_ALE | gpmc_advn_ale |  | timer4 |  |  |  |  | gpio2[2]
8 |  | T7 | 0x94 | GPMC_OEn_REn | gpmc_oen_ren |  | timer7 |  |  |  |  | gpio2[3]
9 |  | T6 | 0x9c | GPMC_BEn0_CLE | gpmc_be0n_cle |  | timer5 |  |  |  |  | gpio2[5]
10 |  | U6 | 0x98 | GPMC_WEn | gpmc_wen |  | timer6 |  |  |  |  | gpio2[4]
11 |  | R12 | 0x34 | GPMC_AD13 | gpmc_ad13 | lcd_data18 | mmc1_dat5 | mmc2_dat1 | eqep2b_in | pr1_mii0_txd1 | pr1_pru0_pru_r30_15 | gpio1[13]
12 |  | T12 | 0x30 | GPMC_AD12 | gpmc_ad12 | lcd_data19 | mmc1_dat4 | mmc2_dat0 | eqep2a_in | pr1_mii0_txd2 | pr1_pru0_pru_r30_14 | gpio1[12]
13 |  | T10 | 0x24 | GPMC_AD9 | gpmc_ad9 | lcd_data22 | mmc1_dat1 | mmc2_dat5 | ehrpwm2b | pr1_mii0_col |  | gpio0[23]
14 |  | T11 | 0x28 | GPMC_AD10 | gpmc_ad10 | lcd_data21 | mmc1_dat2 | mmc2_dat6 | ehrpwm2_tripzone_input | pr1_mii0_txen |  | gpio0[26]
15 |  | U13 | 0x3c | GPMC_AD15 | gpmc_ad15 | lcd_data16 | mmc1_dat7 | mmc2_dat3 | eqep2_strobe | pr1_ecap0_ecap_capin_apwm_0 | pr1_pru0_pru_r31_15 | gpio1[15]
16 |  | V13 | 0x38 | GPMC_AD14 | gpmc_ad14 | lcd_data17 | mmc1_dat6 | mmc2_dat2 | eqep2_index | pr1_mii0_txd0 | pr1_pru0_pru_r31_14 | gpio1[14]
17 |  | U12 | 0x2c | GPMC_AD11 | gpmc_ad11 | lcd_data20 | mmc1_dat3 | mmc2_dat7 | ehrpwm0_synco | pr1_mii0_txd3 |  | gpio0[27]
18 |  | V12 | 0x8c | GPMC_CLK | gpmc_clk | lcd_memory_clk | gpmc_wait1 | mmc2_clk | pr1_mii1_crs | pr1_mdio_mdclk | mcasp0_fsr | gpio2[1]
19 |  | U10 | 0x20 | GPMC_AD8 | gpmc_ad8 | lcd_data23 | mmc1_dat0 | mmc2_dat4 | ehrpwm2a | pr1_mii_mt0_clk |  | gpio0[22]
20 | emmc | V9 | 0x84 | GPMC_CSn2 | gpmc_csn2 | gpmc_be1n | mmc1_cmd | pr1_edio_data_in7 | pr1_edio_data_out7 | pr1_pru1_pru_r20_13 | pr1_pru1_pru_r31_13 | gpio1[31]
21 | emmc | U9 | 0x80 | GPMC_CSn1 | gpmc_csn1 | gpmc_clk | mmc1_clk | pr1_edio_data_in6 | pr1_edio_data_out6 | pr1_pru1_pru_r30_12 | pr1_pru1_pru_r31_12 | gpio1[30]
22 | emmc | V8 | 0x14 | GPMC_AD5 | gpmc_ad5 | mmc1_dat5 |  |  |  |  |  | gpio1[5]
23 | emmc | U8 | 0x10 | GPMC_AD4 | gpmc_ad4 | mmc1_dat4 |  |  |  |  |  | gpio1[4]
24 | emmc | V7 | 0x04 | GPMC_AD1 | gpmc_ad1 | mmc1_dat1 |  |  |  |  |  | gpio1[1]
25 | emmc | U7 | 0x00 | GPMC_AD0 | gpmc_ad0 | mmc1_dat0 |  |  |  |  |  | gpio1[0]
26 |  | V6 | 0x7c | GPMC_CSn0 | gpmc_csn0 |  |  |  |  |  |  | gpio1[29]
27 | hdmi | U5 | 0xe0 | LCD_VSYNC | lcd_vsync | gpmc_a8 | gpmc_a1 | pr1_edio_data_in2 | pr1_edio_data_out2 | pr1_pru1_pru_r30_8 | pr1_pru1_pru_r31_8 | gpio2[22]
28 | hdmi | V5 | 0xe8 | LCD_PCLK | lcd_pclk | gpmc_a10 | pr1_mii0_crs | pr1_edio_data_in4 | pr1_edio_data_out4 | pr1_pru1_pru_r30_10 | pr1_pru1_pru_r31_10 | gpio2[24]
29 | hdmi | R5 | 0xe4 | LCD_HSYNC | lcd_hsync | gpmc_a9 | gpmc_a2 | pr1_edio_data_in3 | pr1_edio_data_out3 | pr1_pru1_pru_r30_9 | pr1_pru1_pru_r31_9 | gpio2[23]
30 | hdmi | R6 | 0xec | LCD_AC_BIAS_EN | lcd_ac_bias_en | gpmc_a11 | pr1_mii1_crs | pr1_edio_data_in5 | pr1_edio_data_out5 | pr1_pru1_pru_r30_11 | pr1_pru1_pru_r31_11 | gpio2[25]
31 | hdmi | V4 | 0xd8 | LCD_DATA14 | lcd_data14 | gpmc_a18 | eqep1_index | mcasp0_axr1 | uart5_rxd | pr1_mii_mr0_clk | uart5_ctsn | gpio2[20]
32 | hdmi | T5 | 0xdc | LCD_DATA15 | lcd_data15 | gpmc_a19 | eqep1_strobe | mcasp0_ahclkx | mcasp0_axr3 | pr1_mii0_rxdv | uart5_rtsn | gpio2[21]
33 | hdmi | V3 | 0xd4 | LCD_DATA13 | lcd_data13 | gpmc_a17 | eqep1b_in | mcap0_fsr | mcasp0_axr3 | pr1_mii0_rxer | uart4_rtsn | gpio2[19]
34 | hdmi | U4 | 0xcc | LCD_DATA11 | lcd_data11 | gpmc_a15 | ehrpwm1b | mcasp0_ahclkr | mcasp0_axr2 | pr1_mii0_rxd0 | uart3_rtsn | gpio2[17]
35 | hdmi | V2 | 0xd0 | LCD_DATA12 | lcd_data12 | gpmc_a16 | eqep1a_in | mcasp0_aclkr | mcasp0_axr2 | pr1_mii0_rxlink | uart4_ctsn | gpio2[18]
36 | hdmi | U3 | 0xc8 | LCD_DATA10 | lcd_data10 | gpmc_a14 | ehrpwm1a | mcasp0_axr0 |  | pr1_mii0_rxd1 | uart3_ctsn | gpio2[16]
37 | hdmi | U1 | 0xc0 | LCD_DATA8 | lcd_data8 | gpmc_a12 | ehrpwm1_tripzone_input | mcasp0_aclkx | uart5_txd | pr1_mii0_rxd3 | uart2_ctsn | gpio2[14]
38 | hdmi | U2 | 0xc4 | LCD_DATA9 | lcd_data9 | gpmc_a13 | ehrpwm0_synco | mcasp0_fsx | uart5_rxd | pr1_mii0_rxd2 | uart2_rtsn | gpio2[15]
39 | hdmi | T3 | 0xb8 | LCD_DATA6 | lcd_data6 | gpmc_a6 | pr1_edio_data_in6 | eqep2_index | pr1_edio_data_out6 | pr1_pru1_pru_r30_6 | pr1_pru1_pru_r31_6 | gpio2[12]
40 | hdmi | T4 | 0xbc | LCD_DATA7 | lcd_data7 | gpmc_a7 | pr1_edio_data_in7 | eqep2_strobe | pr1_edio_data_out7 | pr1_pru1_pru_r30_7 | pr1_pru1_pru_r31_7 | gpio2[13]
41 | hdmi | T1 | 0xb0 | LCD_DATA4 | lcd_data4 | gpmc_a4 | pr1_mii0_txd1 | eqep2a_in |  | pr1_pru1_pru_r30_4 | pr1_pru1_pru_r31_4 | gpio2[10]
42 | hdmi | T2 | 0xb4 | LCD_DATA5 | lcd_data5 | gpmc_a5 | pr1_mii0_txd0 | eqep2b_in |  | pr1_pru1_pru_r30_5 | pr1_pru1_pru_r31_5 | gpio2[11]
43 | hdmi | R3 | 0xa8 | LCD_DATA2 | lcd_data2 | gpmc_a2 | pr1_mii0_txd3 | ehrpwm2_tripzone_input |  | pr1_pru1_pru_r30_2 | pr1_pru1_pru_r31_2 | gpio2[8]
44 | hdmi | R4 | 0xac | LCD_DATA3 | lcd_data3 | gpmc_a3 | pr1_mii0_txd2 | ehrpwm0_synco |  | pr1_pru1_pru_r30_3 | pr1_pru1_pru_r31_3 | gpio2[9]
45 | hdmi | R1 | 0xa0 | LCD_DATA0 | lcd_data0 | gpmc_a0 | pr1_mii_mt0_clk | ehrpwm2a |  | pr1_pru1_pru_r30_0 | pr1_pru1_pru_r31_0 | gpio2[6]
46 | hdmi | R2 | 0xa4 | LCD_DATA1 | lcd_data1 | gpmc_a1 | pr1_mii0_txen | ehrpwm2b |  | pr1_pru1_pru_r30_1 | pr1_pru1_pru_r31_1 | gpio2[7]
