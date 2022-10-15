package com.example.gdsci2it

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation



/*Composable
fun Navigation()
{
val navController= rememberNavController()
    NavHost(navController = navController, startDestination = navigation.Home.route)
    {
        composable(navigation.Home.route)
        {
            HomeScreen(navController)
        }

    }
}
*/
@Composable
fun Main(navController: NavController? = null)
{

    Box()
    {
        Text(text = "Past Events", fontWeight = FontWeight.Bold)
    }
    Column(modifier=Modifier.verticalScroll(rememberScrollState()))
    {
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .padding(top = 25.dp)
        )
        {


            Column()
            {
                Image(
                    painter = painterResource(id = R.drawable.kotlin_dsc_promo_event_page_thumbnail_r2_navy),
                    contentDescription = "android kotlin image"
                )
                Box(contentAlignment = Alignment.TopCenter)
                {
                    Text(text = "Learn Object Oriented   ", fontWeight = FontWeight.Bold)
                    Text(
                        text = "Programming with Kotlin  ",
                        modifier = Modifier.padding(top = 17.dp),
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Compose camp is a niche  ",
                        modifier = Modifier.padding(top = 32.dp)
                    )
                    Text(
                        text = "version of Android Study ",
                        modifier = Modifier.padding(top = 47.dp)
                    )
                    Text(
                        text = "Jam to learn Android     ",
                        modifier = Modifier.padding(top = 62.dp)
                    )
                    Text(
                        text = "Development using GDSC   ",
                        modifier = Modifier.padding(top = 77.dp)
                    )

                }

                Button(
                    onClick = { navController?.navigate("navigation")

                    }, modifier = Modifier.clip(
                        RoundedCornerShape(50)
                    ).clickable { navController?.navigate("navigation") }
                ) {
                    Text(text = "->")

                }
            }
            Column()
            {
                Image(
                    painter = painterResource(id = R.drawable.jetpack_compose_desktop_icon_ryfcwcn),
                    contentDescription = "jetpack compose Icon"
                )
                Box(contentAlignment = Alignment.TopCenter)
                {
                    Text(text = "Let us build with Compose  ", fontWeight = FontWeight.Bold)
                    Text(
                        text = "Programming with Kotlin  ",
                        modifier = Modifier.padding(top = 17.dp),
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Compose camp is a niche  ",
                        modifier = Modifier.padding(top = 32.dp)
                    )
                    Text(
                        text = "version of Android Study ",
                        modifier = Modifier.padding(top = 47.dp)
                    )
                    Text(
                        text = "Jam to learn Android     ",
                        modifier = Modifier.padding(top = 62.dp)
                    )
                    Text(
                        text = "Development using GDSC   ",
                        modifier = Modifier.padding(top = 77.dp)
                    )

                }
                val handler5= LocalUriHandler.current
                Button(
                    onClick = {
                              handler5.openUri("https://gdsc.community.dev/events/details/developer-student-clubs-international-institute-of-information-technology-isquareit-pune-presents-let-us-build-with-compose/")

                    }, modifier = Modifier.clip(
                        RoundedCornerShape(50)
                    )
                ) {
                    Text(text = "->")
                }

            }

            Column()
            {
                Image(
                    painter = painterResource(id = R.drawable.compose),
                    contentDescription = "Compose Image"
                )
                Box(contentAlignment = Alignment.TopCenter)
                {
                    Text(text = "Learn Kotlin and Jetpack   ", fontWeight = FontWeight.Bold)
                    Text(
                        text = "    Compose  ",
                        modifier = Modifier.padding(top = 17.dp),
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "In the previous event of   ",
                        modifier = Modifier.padding(top = 32.dp)
                    )
                    Text(
                        text = "Compose camp we got to know about  ",
                        modifier = Modifier.padding(top = 47.dp)
                    )
                    Text(
                        text = "Android and Scope of Android   ",
                        modifier = Modifier.padding(top = 62.dp)
                    )
                    Text(
                        text = "Development and how    ",
                        modifier = Modifier.padding(top = 77.dp)
                    )
                    Text(
                        text = "Jetpack compose has been a game  ",
                        modifier = Modifier.padding(top = 93.dp)
                    )

                }
                val handler= LocalUriHandler.current
                Button(
                    onClick = {
                  handler.openUri("https://gdsc.community.dev/events/details/developer-student-clubs-international-institute-of-information-technology-isquareit-pune-presents-learn-kotlin-and-jetpack-compose/")

                    }, modifier = Modifier.clip(
                        RoundedCornerShape(50)
                    )
                ) {
                    Text(text = "->")
                }

            }
            Column()
            {
                Image(
                    painter = painterResource(id = R.drawable.gdev_eccosystems_bevy_chapters_thumbnail_cwnbe37),
                    contentDescription = "gdsc Image"
                )
                Box(contentAlignment = Alignment.TopCenter)
                {
                    Text(text = "GDSC Info Session   ", fontWeight = FontWeight.Bold)
                    Text(
                        text = "  This event is a info   ",
                        modifier = Modifier.padding(top = 17.dp)
                    )
                    Text(
                        text = "session as well as a new    ",
                        modifier = Modifier.padding(top = 32.dp)
                    )
                    Text(
                        text = "edition of know your domain ",
                        modifier = Modifier.padding(top = 47.dp)
                    )
                    Text(
                        text = "  for mobile app development and    ",
                        modifier = Modifier.padding(top = 62.dp)
                    )
                    Text(
                        text = "also to spread awareness about     ",
                        modifier = Modifier.padding(top = 77.dp)
                    )
                    Text(
                        text = "compose camp  ",
                        modifier = Modifier.padding(top = 93.dp)
                    )

                }
                val handler1= LocalUriHandler.current
                Button(
                    onClick = {
                              handler1.openUri("https://gdsc.community.dev/events/details/developer-student-clubs-international-institute-of-information-technology-isquareit-pune-presents-gdsc-info-session/we2`")
                    }, modifier = Modifier.clip(
                        RoundedCornerShape(50)
                    )
                ) {
                    Text(text = "->")
                }

            }


        }

        Text(text = "Future Events", fontWeight = FontWeight.Bold)

        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .padding(top = 25.dp)
        )
        {


            Column()
            {
                Image(
                    painter = painterResource(id = R.drawable.fu1),
                    contentDescription = " Speaker Icon"
                )
                Box(contentAlignment = Alignment.TopStart)
                {
                    Text(text = "KNOW YOUR DOMAIN:   ", fontWeight = FontWeight.Bold)
                    Text(
                        text = "Web Development Edition  ",
                        modifier = Modifier.padding(top = 17.dp),
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "We have designed a super   ",
                        modifier = Modifier.padding(top = 32.dp)
                    )
                    Text(
                        text = " beginner-oriented event    ",
                        modifier = Modifier.padding(top = 47.dp)
                    )
                    Text(
                        text = "for the budding Web Developers  ",
                        modifier = Modifier.padding(top = 62.dp)
                    )
                    Text(
                        text = "out there!  ",
                        modifier = Modifier.padding(top = 77.dp)
                    )


                }
                val handler2= LocalUriHandler.current
                Button(
                    onClick = {
                              handler2.openUri("https://gdsc.community.dev/events/details/developer-student-clubs-international-institute-of-information-technology-isquareit-pune-presents-gdsc-info-session/")
                    }, modifier = Modifier.clip(
                        RoundedCornerShape(50)
                    )
                ) {
                    Text(text = "->")

                }
            }





        }
    }
}

@Composable
fun Details()
{
    Text(text = "This is the info about kotlin")
}