  _________            .__    .____________        __   
 /   _____/__ __  _____|  |__ |__\______   \ _____/  |_ 
 \_____  \|  |  \/  ___/  |  \|  ||    |  _//  _ \   __\
 /        \  |  /\___ \|   Y  \  ||    |   (  <_> )  |  
/_______  /____//____  >___|  /__||______  /\____/|__|  
               
         __
 _(\    |@@|
(__/\__ \--/ __
   \___|----|  |   __
       \ }{ /\ )_ / _\
       /\__/\ \__O (__
      (--/\--)    \__/
      _)(  )(_
     `---''---`

> Robot: What is my purpose?
> Me: You pass Sushi.

┌────────┬────────┐
│i:0, v:x│i:0, v:x│
└────────┴────────┘

robot.turnOn()
> count = 0 [x,x]

robot.pickup()
> returns true | [count] = 🍣 | count = 1 

robot.pickup()
> returns true | [count] = 🍣 | count = 2

robot.pickup()
> returns false | count = 2 | nothing

robot.drop()
> returns true | [count-1] = x | count = 1 

robot.drop()
> returns true | [count-1] = x | count = 0

robot.pickup()
> returns true | [count] = 🍣 | count = 1

