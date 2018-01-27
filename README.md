# karamba
A collection of useful Kotlin extension for Android

![karamba](https://github.com/matteocrippa/karamba/blob/master/.github/karamba.png?raw=true)

# Install

Add to **gradle** in _allprojects_

```
maven { url 'https://jitpack.io' }
```

then add this

```
compile 'com.github.matteocrippa:karamba:1.1.0'
```

# Usage
`Karamba` provides you a list of different and useful extensions for your project, here the list organized by the type extended.

## General
- `support(apiVersion)`, lambda that allow you to run code only if current SDK is up to specified one
- `supportKitkat()`, lambda that checks if kitkat is supported and run the code
- `supportLollipop()`, lambda that checks if lollipop is supported and run the code

## Bitmap
- `base64()`, produces a base64 representation of the current bitmap 
- `resize(height, width)`, resize the current bitmap to new format

## Boolean
- `toggle()`, handle the bool as a toogle changing the value to opposite one, then the new value is returned (not yet possible to change this)
- `random()`, returns a random boolean value, then the new value is returned (not yet possible to change this)

## Date
- `convertTo(format)`, converts current date to a custom format provided as argument (eg. `dd-MM-yy HH:mm`)
- `toCalendar()`, converts current date to `Calendar`
- `isFuture()`, returns true if date is in the future
- `isPast()`, returns true if date is in the past
- `isToday()`, returns if current date is today
- `isTomorrow()`, returns if current date is tomorrow
- `isYesterday()`, returns if current date is yesterday
- `today()`, returns today's date
- `tomorrow()`, returns tomorrow's date
- `yesterday()`, returns yesterday's date
- `hour()`, returns current date hour as number
- `minute()`, returns current date minutes as number
- `second()`, returns current date seconds as number
- `month()`, returns current date month as number
- `monthName()`, returns current date month as long name
- `year()`, returns current date year as number
- `day()`, returns current date day as number
- `dayOfWeek()`, returns current date day of the week as number
- `dayOfWeekName()`, returns current date weekday as string
- `dayOfYear()`, returns current date day of year as number


## Double
- `localCurrency(currency)`, converts current double to the currency format passed as argument (eg. `EUR`)
- `celsiusToFahrenheit()`, converts current double to fahrenheit
- `fahrenheitToCelsius()`, converts current double to celsius

## Drawable
- `toBitmap()`, converts the current drawable in `Bitmap`

## Int
- `readableDistanceFromMeters()`, converts an int amount of meters in a readable meter, kilometers distance
- `commaSeparatedId()`, converts an array of int, in a string of comma separated items
- `random()`, provides a random number in the range provided (eg. `(0..10).random()`)

## String
- `isValidEmail()`, returns if current string is a valid email
- `isUrl()`, returns if current string is a valid url
- `isNumeric()`, returns if current string contains a number
- `isPhoneNumber()`, returns if current string contains a phone number
- `random(lenght)`, returns a random string of provided length
- `toBitmap()`, convert current base64 string into Bitmap
- `ellipsize(chars)`, ellipsizes the current string, truncating at defined amount of characters
- `toDate(format)`, converts current string in a `Date` object using the provided format
- `plainText()`, removes all html formatting from current string
- `toCamelCase()`, camel case the current string current string


## View
- `toBitmap()`, converts current view into `Bitmap`


#### Credits

Icon is taken by free emojii set by [Vincent Le Moign](https://dribbble.com/webalys)