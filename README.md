Sleeping Barber

Περιγραφή του προβλήματος
Κατά την πρώτη εκτέλεση της εφαρμογής δημιουργείται το γραφικό περιβάλλον.
Αρχικά δημιουργούνται με μια τυχαία καθυστέρηση τα 10 κουμπιά που αντιστοιχούν στους υποψήφιους πελάτες.
Αυτοί περνάν διαδοχικά τις εξής θέσεις: έξω από το κουρείο (θέση 0), έξω από την αίθουσα αναμονής (θέση 1) ,
αίθουσα αναμονής (θέση 2) , κούρεμα (θέση 3).

Σημειώνεται ότι μόνο τέσσερεις πελάτες μπορούν να περιμένουν στην αίθουσα αναμονής ενώ οι υπόλοιποι περιμένουν απ έξω.
Ένας πελάτης μπορεί να κουρεύεται και ο κουρέας μετά από κάποια κουρέματα (συγκεκριμένα 9) χρειάζεται ανάπαυση,
πηγαίνοντας στην αίθουσα αναμονής και κανένας δεν εισέρχεται για κούρεμα.

Κάθε πελάτης που δημιουργείται (κουμπί) τρέχει ένα διαφορετικό νήμα (κάνοντας extend την κλάση Thread)
και αυτά τρέχουν ταυτόχρονα.

Ο συγχρονισμός των νημάτων έγινε με σημαφόρους.
