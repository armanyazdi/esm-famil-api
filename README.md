# API اسم فامیل

اسم فامیل یک نوع بازی است که با قلم و کاغذ انجام می شود. شرکت کنندگان پس از توافق روی یکی از حروف الفبا، نام موضوعات مختلفی را می نویسند که با آن حرف الفبا آغاز می شود.

این api با حرف الفبای داده شده، اسم، فامیل و ... تولید می کند.

## شیوه فراخوانی

**GET:**

```
http://localhost:8080/api/esmfamil?letter=CHAR
```


- letter: حرف الفبای انتخاب شده

## فرمت پاسخ

```json
{
  "id": 1,
  "status": "OK",
  "name": "مهرداد",
  "family": "موسوی نژاد",
  "food": "مرغ سوخاری",
  "fruit": "میوه اژدها",
  "color": "مرجانی",
  "city": "مشکین دشت",
  "country": "ماداگاسکار",
  "animal": "میمون",
  "flower": "میخک",
  "car": "مزدا",
  "object": "میخ"
}
```