<h2> meta-rom </h2>   
        <h3>meta-romrobotics</h3>
	    <ol>
		 <li><b>rom-noetic-base.bb</b></li>
		    <ul>
		        <li>opehssh server </li>
				<li>password assigned(user=root, password=ghostman) </li>
				<li>new user assigned(user=rom, password=robotics) no ssh login, no sudoers </li>
				<li>chage for root</li>
				<li>splash screen</li>
				<li>static ip(192.168.1.10/24) assigned</li>
				<li>uart enable</li>
				<li>package management system (ipk) </li>
		    </ul>	       
	    </ol>
	    <p>Yocto က sh shell သုံးတာမို့လို့  /etc/profile မှာ source /opt/ros/noetic/setup.sh သွားထည့်ပါ။</p>
	    <p>
	    Yocto မှာ default အားဖြင့် systemd မဟုတ်ဘဲ init ဖြစ်တာကြောင့် /etc/init.d /etc/initab တို့ကို သိထားဖို့လိုပါမယ်။ init ကို မသုံးရင်လည်း systemd အသုံးပြုနိုင်ပါတယ်။ ros node တွေ auto start ဖြစ်အောင် တခြားနည်းလမ်းတွေဖြစ်တဲ့ cron တို့ ros package ထဲက auto start package တွေလဲအသုံးပြုနိုင်ပေမဲ့ ယခု yocto မှာမို့ ကန့်သတ်ချက်တွေရှိနိုင်ပြီး စမ်းသပ်ပြီးမှသာ အသုံးပြုနိုင်ပါမယ်။ အခု init နည်းလမ်းကတော့ ရိုးရှင်းပြီး အခြေခံကျပါတယ်။ init script ရေးဖို့အတွက် ROM ROBOTICS မှထုတ်ဝေမည့် " အဆင့်မြင့် ROBOT " စာအုပ်  embedded linux အခန်း  ကို ဖတ်ပါ။</p>

<h4> rom-noetic-robot</h4>
- rom-noetic-robot ကို bitbake လုပ်ရတာတွင် opencv, pcl တို့ကို compile လုပ်သည်။ pcl lib များကို compile လုပ်ရာတွင် swap 5G ဖြင့် မအောင်မြင်ပါ။ swap 24G ပေးရာအောင်မြင်သည်။ ros meta package များဖွဲ့စည်းပုံကို ပုံတွင်ကြည့်ပါ။
<img src="images/map.png" />
- mobile robot အတွက် အောက်ပါ package များသွင်းရန်လိုသည်။
		- rplidar_ros
		- map_server
		- slam_gmapping
		- amcl
		- move_base
		- global_planner
		- local_planner
		- rotate_recovery
		- clear_costmap_recovery
		- costmap_2D
		- carrot_planner

	
   



This README file contains information on the contents of the meta-romrobotics layer.

Please see the corresponding sections below for details.

Dependencies
============

  URI: <first dependency>
  branch: <branch name>

  URI: <second dependency>
  branch: <branch name>

  .
  .
  .

Patches
=======

Please submit any patches against the meta-romrobotics layer to the xxxx mailing list (xxxx@zzzz.org)
and cc: the maintainer:

Maintainer: XXX YYYYYY <xxx.yyyyyy@zzzzz.com>

Table of Contents
=================

  I. Adding the meta-romrobotics layer to your build
 II. Misc


I. Adding the meta-romrobotics layer to your build
=================================================

Run 'bitbake-layers add-layer meta-romrobotics'

II. Misc
========

--- replace with specific information about the meta-romrobotics layer ---
